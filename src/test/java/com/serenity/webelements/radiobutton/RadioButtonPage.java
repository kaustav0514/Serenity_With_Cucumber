package com.serenity.webelements.radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webelements.RadioButtonGroup;


public class RadioButtonPage extends PageObject {


	public void radiobttnclick() {
		
		open();
		getDriver().manage().window().maximize();
		List<WebElement>  rdlist = getDriver().findElements(By.className("radioButton"));
		RadioButtonGroup rdg = new RadioButtonGroup(rdlist);
		
		rdg.selectByValue("radio2");
		
	}

	public void radiobttnclick2() {
		
		open();
		getDriver().manage().window().maximize();
		inRadioButtonGroup("radioButton").selectByValue("radio3");
		
		
		System.out.println(inRadioButtonGroup("radioButton").getSelectedValue().get());
		
	}
     

}
