package com.serenity.webelements.dropdown;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.Dropdown;

@DefaultUrl("/dropdown")
public class DropDownPage extends PageObject {
	
	@FindBy(id ="dropdown")
	private WebElementFacade drpdwnid;
//	private WebElement drpdwnid;
	
	public void dropdo() {
		
		open();
		getDriver().manage().window().maximize();
//		Dropdown.forWebElement(drpdwnid).selectByValue("2");
//		Dropdown.forWebElement(drpdwnid).select("Option 1");
		
		selectFromDropdown(drpdwnid, "Option 2");
		System.out.println("label is : " + getSelectedLabelFrom(drpdwnid));
		System.out.println("VAlue is : " + getSelectedValueFrom(drpdwnid));

	  
//		In selenium 
//		Select oselect = new Select(drpdwnid);
//	    oselect.selectByValue("2");
	}
	

}
