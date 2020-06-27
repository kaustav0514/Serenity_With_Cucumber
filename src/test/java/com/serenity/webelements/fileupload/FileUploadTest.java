package com.serenity.webelements.fileupload;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)
public class FileUploadTest {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	FileUploadPage fup;

	
	@Test
	public void tc1() {
		
		fup.fileupload();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
