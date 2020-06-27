package com.serenity.webelements.checkbox;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.Checkbox;

@DefaultUrl("/checkboxes")
public class CheckBoxPage extends PageObject {
	
	@FindBy(xpath = "//body//input[1]")
	private WebElementFacade firstckcbx; 

	@FindBy(xpath = "//body//input[2]")
	private WebElementFacade secondckcbx; 	
	
	public void checkBoxtest() {
		
		open();
		getDriver().manage().window().maximize();
		
		Checkbox chckbx = new Checkbox(secondckcbx);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		chckbx.setChecked(false);
		System.out.println(chckbx.isChecked());
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
       Checkbox chckbx1 = new Checkbox(firstckcbx);
		
		chckbx1.setChecked(true);

		System.out.println(chckbx1.isChecked());

	}
	
public void checkBoxtest1() {
		
		open();
		getDriver().manage().window().maximize();
		
//		Checkbox chckbx = new Checkbox(secondckcbx);
		
		setCheckbox(secondckcbx, false);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//       Checkbox chckbx1 = new Checkbox(firstckcbx);
		
       setCheckbox(firstckcbx, true);


	}
	
    

}
