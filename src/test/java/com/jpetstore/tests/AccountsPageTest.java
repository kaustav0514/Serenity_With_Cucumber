package com.jpetstore.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;
import com.jpetstore.steps.PetStoreSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class AccountsPageTest {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	PetStoreSteps steps;
	
	@Title("Add a new user to store and verify the new user cna login ")
	@Test
	public void addNewUserToStoreAndVerify() {
		
		Faker faker =new Faker();
		String username = "test" + faker.number().randomNumber(5, false);
		String password = faker.internet().password();
		String repeatpassword = password;
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String email = faker.internet().emailAddress();
		String phone = faker.phoneNumber().cellPhone();
		String add1 = faker.address().streetAddress();
		String add2 = faker.address().secondaryAddress();
		String city = faker.address().city();
		String state = faker.address().state();
		String zip = faker.address().zipCode();
		String country = faker.address().country();
		
		steps.navigate_to_signonPage();
		steps.navigate_to_registrationPage();
		steps.addNewUSerInfo(username, password, repeatpassword);
		steps.addAccountInfo(firstname, lastname, email, phone, add1, add2, city, state, zip, country);
        steps.addProfileInfo("english", "DOGS", true, true);
		steps.clickSaveaccountInfo();
		steps.doLogin(username, password);
        String greetingMsg = steps.getGreetingMsg();
		assertEquals("Welcome " + firstname +"!", greetingMsg);

		
	}
	

}
