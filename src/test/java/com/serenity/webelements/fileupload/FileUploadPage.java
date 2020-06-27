package com.serenity.webelements.fileupload;

import java.io.File;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/upload")
public class FileUploadPage extends PageObject {
	
	@FindBy(id = "username")
	private WebElementFacade username; 

	
	
	public void fileupload() {
		
		open();
		getDriver().manage().window().maximize();
		
		String filepath = System.getProperty("user.dir") + File.separator + "sample.png" ;
		
		upload(filepath).to($("#file-upload"));
		$("#file-submit").click();
	}
	
}
