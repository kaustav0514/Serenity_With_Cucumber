package com.serenity.webelements.dropdown;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class DropDownTest {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	DropDownPage ddp;
	
	@Test
	public void tc1() throws InterruptedException {
		
		ddp.dropdo();
		
		Thread.sleep(3000);
		
	}
	

}
