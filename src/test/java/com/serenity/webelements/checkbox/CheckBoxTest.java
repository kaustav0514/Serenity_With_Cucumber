package com.serenity.webelements.checkbox;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)
public class CheckBoxTest {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	CheckBoxPage cbk;

	
	@Test
	public void tc1() {
		
		
		
//		cbk.checkBoxtest();
		cbk.checkBoxtest1();

		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
