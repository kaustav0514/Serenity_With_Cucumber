package com.jpetstore.cucumber.steps;

import static org.junit.Assert.assertEquals;

import com.github.javafaker.Faker;
import com.jpetstore.cucumber.steps.serenity.PetStoreSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class UserRegistrationSteps {
	
	
	@Steps
	PetStoreSteps shopper;
	
	Faker faker =new Faker();
	
	
	@Given("^Navigate to registration page$")
	public void navigate_to_registration_page() {
		shopper.navigate_to_signonPage();
		shopper.navigate_to_registrationPage();
	
	}


	@Given("^add new user information$")
	public void add_new_user_information() {
		String username = "test" + faker.number().randomNumber(5, false);
		Serenity.setSessionVariable("username").to(username);
		
		String password = faker.internet().password();
		Serenity.setSessionVariable("password").to(password);

		String repeatpassword = password;

		shopper.addNewUSerInfo(username, password, repeatpassword);
		
	}

	@Given("^add account information$")
	public void add_account_information() {
		
		String firstname = faker.name().firstName();
		Serenity.setSessionVariable("firstname").to(firstname);

		String lastname = faker.name().lastName();
		String email = faker.internet().emailAddress();
		String phone = faker.phoneNumber().cellPhone();
		String add1 = faker.address().streetAddress();
		String add2 = faker.address().secondaryAddress();
		String city = faker.address().city();
		String state = faker.address().state();
		String zip = faker.address().zipCode();
		String country = faker.address().country();

		
		shopper.addAccountInfo(firstname, lastname, email, phone, add1, add2, city, state, zip, country);
	
	}

	@Given("^add profile information$")
	public void add_profile_information() {
		shopper.addProfileInfo("english", "DOGS", true, true);
		
	
	}

	@Given("^save the information$")
	public void save_the_information() {
		shopper.clickSaveaccountInfo();
	
	}

	@When("^login with the credentials$")
	public void login_with_the_credentials() {
	
		String username = Serenity.sessionVariableCalled("username");
	    String password = Serenity.sessionVariableCalled("password");
	
		shopper.doLogin(username, password);
      
	
	}

	@Then("^user will be able to view the welcome greeting with the user name on it$")
	public void user_will_be_able_to_view_the_welcome_greeting_with_the_user_name_on_it() {

	    String firstname = Serenity.sessionVariableCalled("firstname");

		  String greetingMsg = shopper.getGreetingMsg();
			assertEquals("Welcome " + firstname +"!", greetingMsg);

	}


}
