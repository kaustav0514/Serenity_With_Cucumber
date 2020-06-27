package com.serenity.webelements.editbox;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)
public class EditBoxTest {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	EditBoxPage ed;

	
	@Test
	public void tc1() {
		
//		ed.editBoxtest();
		ed.loginwithclickmethod();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
