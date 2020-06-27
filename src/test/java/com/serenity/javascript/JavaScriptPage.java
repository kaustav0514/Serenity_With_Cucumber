package com.serenity.javascript;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class JavaScriptPage extends PageObject {
	
	@FindBy(xpath = "//button[contains(text() , 'JS Alert')]")
	private WebElementFacade regbtn;
	
	
	public void injectalert() throws InterruptedException {

		open();
		getDriver().manage().window().maximize();
//		evaluateJavascript("alert('This is my modified alert')");
//		evaluateJavascript("document.querySelector(\"a[href='/abtest']\").click()");
		
		
		WebElement abtest = (WebElement) evaluateJavascript("return document.querySelector(\"a[href='/abtest']\")");
		
		   abtest.click();
		Thread.sleep(3000);
//		getAlert().accept();
		
		
	
		
		
	}
	
	
	public void getelements() throws InterruptedException {

		open();
		getDriver().manage().window().maximize();
		List<WebElement> listall = (List<WebElement>) evaluateJavascript("return document.getElementsByTagName('a')");
		
		for(WebElement el : listall) {
			
			System.out.println(el.getText());
			
		}
		
		Thread.sleep(3000);
	
		
		
	}
	
	



	
	
}
