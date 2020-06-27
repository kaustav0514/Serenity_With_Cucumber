package com.synchronization.pages;

import static java.time.temporal.ChronoUnit.SECONDS;

import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dynamic_loading/2")
public class ExplicitWaitPage extends PageObject {
	
	@FindBy(xpath = "//button[contains(text(),'Start')]")
	private WebElementFacade statbtn;
	
	
	@FindBy(xpath = "(//h4)[2]")
	private WebElementFacade headingfound;
	
	
	public void tryexplicit() {
		
			
			open();
			getDriver().manage().window().maximize();

//			setWaitForTimeout(9000);
			
//			statbtn.waitUntilClickable().click();
//			statbtn.withTimeoutOf(10, SECONDS).click();
			
//			waitFor(ExpectedConditions.)
			
//			waitForTitleToAppear("The Internet").waitFor(statbtn).click();
			
//			waitForTextToAppear("Example 2: Element rendered after the fact").waitFor(statbtn).click();
			
			statbtn.waitUntilClickable().click();
			String sos = waitForAbsenceOf("//div[@id='loading']//img").findBy("(//h4)[2]").getText();
			System.out.println(sos);
			
			System.out.println(getWaitForTimeout().toString());
			
			
//						try {
//							Thread.sleep(5000);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}

		
	}
	
}
	

