package com.serenity.webelements.editbox;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/login")
public class EditBoxPage extends PageObject {
	
	@FindBy(id = "username")
	private WebElementFacade username; 

	@FindBy(id = "password")
	private WebElementFacade pass;
	
	
	public void editBoxtest() {
		
		open();
		getDriver().manage().window().maximize();
		username.sendKeys("tomsmith");
		pass.sendKeys("SuperSecretPassword");
		
//		username.clear();
		
	}
	
     public void loginwithclickmethod() {
		
		open();
		getDriver().manage().window().maximize();
		username.typeAndTab("tomsmith");
		pass.typeAndEnter("SuperSecretPassword!");
		
//		username.clear();
		
	}

}
