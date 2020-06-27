package com.mouse_action.pages;

import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class MousePage extends PageObject {
	String url = "https://the-internet.herokuapp.com/hovers";
	
	@FindBy(xpath = "//button[contains(text() , 'JS Alert')]")
	private WebElementFacade regbtn;
	
	
	public void mouseHover() throws InterruptedException {

		
		open();
		getDriver().manage().window().maximize();
		getDriver().get(url);
		
		WebElementFacade image = findBy("(//div[@class='example']//img)[1]");
	
//		In selenium 
//		Actions action = new Actions(getDriver());
		Thread.sleep(3000);
		
		withAction()
		       .moveToElement(image)
		         .build()
		        .perform();
		
		Thread.sleep(3000);
		
		waitForTextToAppear("name: user1")
		.findBy("//a[@href='/users/1']").click();
		
		Thread.sleep(3000);
		
		
	}


public void mouseDragAndDrop() throws InterruptedException {

		
		open();
		getDriver().manage().window().maximize();
		getDriver().get("http://jqueryui.com/droppable/");
//		Thread.sleep(3000);
		
		WebElementFacade iframe = findBy("//iframe[@class='demo-frame']");
		
		getDriver().switchTo().frame(iframe);
		
		withAction()
		      .dragAndDrop(findBy("//*[@id='draggable']"), findBy("//*[@id='droppable']"))
		      .build().perform();
		      
		Thread.sleep(7000);
		
		
	}



	
	
}
