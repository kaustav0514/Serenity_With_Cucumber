package com.alerts.pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class AlertTest {
	
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	
	AlertPage alertpg;
	
	
	@Test
	public void tc1() throws InterruptedException {
		
//		alertpg.regularalert();
//	    alertpg.confirmaralert();	
	    alertpg.promptaralert();
		
		
		
		
		
	}

}
