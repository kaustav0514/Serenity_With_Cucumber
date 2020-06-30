package com.jpetstore.cucumber.steps;

import java.util.List;

import com.jpetstore.Util.PetCategories;
import com.jpetstore.cucumber.steps.serenity.PetStoreSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OrdersPageSteps {
	
	@Steps
	PetStoreSteps shopper;

	
	
	@Given("^User is able to Login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_is_able_to_Login_with_username_and_password(String username, String password) {
		shopper.navigate_to_signonPage();
		shopper.doLogin(username, password);
		
	}


	@When("^Search for a \"([^\"]*)\" and it shows in the result$")
	public void search_for_a_and_it_shows_in_the_result(String petType) {
		
		shopper.searcForProduct(petType);
		shopper.selectProductFromSearchTable(petType); 
	}

	@Then("^User View details about the pet \"([^\"]*)\" and add it to cart$")
	public void user_View_details_about_the_pet_and_add_it_to_cart(String pet) {
	

	     shopper.addToCartSpecificProduct(pet);
	}

	@Then("^click on proceed to check$")
	public void click_on_proceed_to_check() {
		
          shopper.clickonProceedToCheckoutBtn();
		
	}
	
	@Given("Click on category, then a category is displayed")
	public void Click_on_category_then_a_category_is_displayed(DataTable datatable) {
		
		 List<String> dt = datatable.asList(String.class);
		 
		 for(String s: dt) {
			 shopper.navigateToProductCategory(PetCategories.valueOf(s));
		 }
		
	}
	

}
