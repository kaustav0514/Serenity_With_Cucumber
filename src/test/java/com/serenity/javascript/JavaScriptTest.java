package com.serenity.javascript;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class JavaScriptTest {
	
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	
	JavaScriptPage jspg;
	
	
	@Test
	public void tc1() throws InterruptedException {
		
		
//		jspg.injectalert();
		jspg.getelements();
		
		
	}

}
