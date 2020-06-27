package com.serenity.webelements.htmltable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)
public class HTMLTableTest {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	HTMLTablePage htmp;

	
	@Test
	public void tc1() {
		
//		htmp.readcompletetable();
		
//		htmp.extractvalues();
	
//		htmp.extractheadings();
		
//		htmp.extractvaluesanother();
	
//		htmp.readtableifnoheader();
		
		htmp.assertvalue();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
