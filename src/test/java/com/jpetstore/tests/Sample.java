package com.jpetstore.tests;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.jpetstore.Util.PetCategories;
import com.jpetstore.steps.PetStoreSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class Sample {
	
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Steps
	PetStoreSteps shopper;
	
	
	@Title("Navigating to sign on page")
	@Test
	public void navigateToSignon() throws InterruptedException {
		
		shopper.navigate_to_signonPage();
		shopper.doLogin("tinku", "tinku");
//		shopper.navigate_to_dashBoardPage();
//		shopper.selectProductsFromSideBarDisplay(PetCategories.DOGS);
//		shopper.selectPetByName(PetCategories.DOGS, "Labrador Retriever");
		
//		shopper.addToCartSpecificProduct("Adult Male Labrador Retriever");
//		shopper.addToCartByViewItemDetails("Adult Male Labrador Retriever", 
//				"Great hunting dog" , "Adult Male Labrador Retrieve" , "Labrador Retriever");
	
		shopper.searcForProduct("Bulldog");
		shopper.selectProductFromSearchTable("Bulldog"); 
		shopper.addToCartSpecificProduct("Male Adult Bulldog");
//		shopper.shoppingCart("Male Adult Bulldog", 0);
		assertNotEquals(null, shopper.shoppingCart("Male Adult Bulldog", 5));
//		shopper.clickonProceedToCheckoutBtn();
		assertTrue( shopper.removeItemFromCart("Male Adult Bulldog") );
		
		Thread.sleep(4000);
		
	}
	

	

}
