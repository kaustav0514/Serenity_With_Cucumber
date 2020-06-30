package com.jpetstore.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.jpetstore.steps.PetStoreSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LoginPageTest {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	PetStoreSteps steps;
	
	@Title("Verify if an user can login successfully to the store ")
	@Test
	public void verifyIfLoginInSuccessful() {
		
		steps.navigate_to_signonPage();
		steps.doLogin("test1", "test1");
		
		String greetingMsg = steps.getGreetingMsg();
		
		assertEquals("Welcome test1!", greetingMsg);
		
	}
	
	@Title("Verify if an user can logout successfully to the store ")
	@Test
	public void verifyIfUserCanLogoutSuccessfully() {
		
		verifyIfLoginInSuccessful();
		
		steps.sign_out();
		
	}
	
	@Title("Verify if message <b><i> 'Invalid username or password. Signon failed.' </i></b> "
			+ "is displayed for invalid credentials ")
	@Test
	public void verifyMessageisDisplayedForInvalidLogin() {
		
		steps.navigate_to_signonPage();
		steps.doLogin("test1", "test");
		String errorMssg = steps.getMessageOnInvalidLogin();
		assertEquals("Invalid username or password. Signon failed.", errorMssg);
		
	}
	
	
	

}
