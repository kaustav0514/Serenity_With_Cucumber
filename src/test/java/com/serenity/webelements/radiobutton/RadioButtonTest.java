package com.serenity.webelements.radiobutton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)
public class RadioButtonTest {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	RadioButtonPage rd;

	
	@Test
	public void tc1() {

//		rd.radiobttnclick();
		rd.radiobttnclick2();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
