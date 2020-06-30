package com.jpetstore.tests;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import com.jpetstore.steps.PetStoreSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class OrderProductsTest {


	@Managed(driver="chrome")
	WebDriver driver;
	
	@Steps
	PetStoreSteps shopper;
	
	Faker faker = new Faker();

	@Title("Order a pet from the pet store ")
	@Test
	public void tc1() throws InterruptedException {
		
		String cardType = "Visa" ;
		String cardNumber = faker.finance().creditCard(CreditCardType.VISA) ; 
		String expDate = "12/2026";
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String add1 = faker.address().streetAddress();
		String add2 = faker.address().secondaryAddress();
		String city = faker.address().city();
		String state = faker.address().state();
		String zip = faker.address().zipCode();
		String country = faker.address().country();
		
		shopper.navigate_to_signonPage();
		
		shopper.doLogin("tinku", "tinku");
		
		shopper.searcForProduct("Bulldog");
		
		shopper.selectProductFromSearchTable("Bulldog"); 
		
		shopper.addToCartSpecificProduct("Male Adult Bulldog");
		
		shopper.clickonProceedToCheckoutBtn();
		
		shopper.enterPaymentAndBillingdetails(cardType, cardNumber, expDate,
				firstname, lastname, add1, add2, city, state, zip, country);
		
		shopper.clickShipToDifferentAddress(true);
		
		shopper.clickOnContinueButton();
		
		String add3 = faker.address().streetAddress();
		String add4 = faker.address().secondaryAddress();
		
		
		shopper.enterShippingInfo(firstname, lastname, add3, add4, city, state, zip, country);
		
		shopper.clickOnContinueButton();
		
		shopper.clickOnConfirmButton();
		
		shopper.verifyOrderSubmitted();
		
		
	}
	
	
	
	
}
