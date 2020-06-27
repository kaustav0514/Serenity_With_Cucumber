package com.mouse_action.pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class MouseTest {
	
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	
	MousePage mousepg;
	
	
	@Test
	public void tc1() throws InterruptedException {
		

//		mousepg.mouseHover();
		mousepg.mouseDragAndDrop();
		
		
		
	}

}
