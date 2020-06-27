package com.synchronization.pages;

import static java.time.temporal.ChronoUnit.SECONDS;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dynamic_loading/2")
public class ImplicitWaitPage extends PageObject {
	
	@FindBy(xpath = "//button[contains(text(),'Start')]")
	private WebElementFacade statbtn;
	
	public void tryimplicit() {
		
		try {
			
			open();
			getDriver().manage().window().maximize();

	        setImplicitTimeout(8, SECONDS);
			System.out.println(getImplicitWaitTimeout().toString());
				        statbtn.click();
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

		}
		
		finally {
			
			resetImplicitTimeout();
		}
		
	}
	
	public void tryimplicit1() {
		
		System.out.println(getImplicitWaitTimeout().toString());
		
		
		
	}

}
