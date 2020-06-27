package com.alerts.pages;

import org.openqa.selenium.Alert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/javascript_alerts")
public class AlertPage extends PageObject {
	
	@FindBy(xpath = "//button[contains(text() , 'JS Alert')]")
	private WebElementFacade regbtn;
	
	@FindBy(xpath = "//button[contains(text() , 'JS Confirm')]")
	private WebElementFacade confrmbtn;
	
	@FindBy(xpath = "//button[contains(text() , 'JS Prompt')]")
	private WebElementFacade prptbtn;
	
	public void regularalert() throws InterruptedException {

		open();
		getDriver().manage().window().maximize();
		regbtn.click();
		
//		In Selenium we have to follow below approach
//		Alert al = getDriver().switchTo().alert();
//		al.accept();
		
		System.out.println(getAlert().getText());
		Thread.sleep(3000);
		getAlert().accept();	
	}

	public void confirmaralert() throws InterruptedException {

		open();
		getDriver().manage().window().maximize();
		confrmbtn.click();
		
		System.out.println(getAlert().getText());
		Thread.sleep(3000);
		getAlert().dismiss();	
	}
	
	public void promptaralert() throws InterruptedException {

		open();
		getDriver().manage().window().maximize();
		prptbtn.click();
		
		System.out.println(getAlert().getText());
		Thread.sleep(3000);
		getAlert().sendKeys("Hello World");
			Thread.sleep(3000);
			getAlert().accept();	
			Thread.sleep(3000);
	}


	
	
}
