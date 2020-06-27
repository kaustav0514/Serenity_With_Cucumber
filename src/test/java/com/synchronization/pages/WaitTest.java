package com.synchronization.pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class WaitTest {
	
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	ImplicitWaitPage impg;
	
	ExplicitWaitPage exwp;
	
	
	@Test
	public void tc1() {
		
//		impg.tryimplicit();
		
//		impg.tryimplicit1();
		
		exwp.tryexplicit();
		
		
		
		
	}

}
