package com.jpetstore.tests;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.jpetstore.Util.PetCategories;
import com.jpetstore.steps.PetStoreSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("testdata/order-products/orders.csv")
public class OrderProductsDDTest {

	private String username;
	private String password;
	private String productCategory;
	private String productname;
	private String specificproductname;
	private String cardType ;
	private String cardNumber ;
	private String expDate ; 
	private String firstname ; 
	private String lastname ;
	private String add1 ;
	private String add2 ;
	private String city ;
	private String state ;
	private String zip ;
	private String country ;

	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public void setSpecificproductname(String specificproductname) {
		this.specificproductname = specificproductname;
	}


	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public void setAdd1(String add1) {
		this.add1 = add1;
	}


	public void setAdd2(String add2) {
		this.add2 = add2;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Managed(driver="chrome")
	WebDriver driver;
	
	@Steps
	PetStoreSteps shopper;
	

	@Title("Order a pet from the pet store ")
	@Test
	public void tc1() throws InterruptedException {
		
        shopper.navigate_to_signonPage();
		
        shopper.doLogin(username, password);
		
	    shopper.navigateToProductCategory(PetCategories.valueOf( productCategory ));
        
        shopper.selectPetByName(PetCategories.valueOf( productCategory ), productname)     ;   
		
		shopper.addToCartSpecificProduct(specificproductname);
		
		shopper.clickonProceedToCheckoutBtn();
		
		shopper.enterPaymentAndBillingdetails(cardType, cardNumber, expDate,
				firstname, lastname, add1, add2, city, state, zip, country);
		
		shopper.clickShipToDifferentAddress(false);
		
		shopper.clickOnContinueButton();
		
		shopper.clickOnConfirmButton();
		
		shopper.verifyOrderSubmitted();		
		
	}
	
	
	
	
}
