package com.serenity.webelements.htmltable;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.HtmlTable;


//Static import for tables

import static net.thucydides.core.matchers.BeanMatchers.*;
import static net.thucydides.core.pages.components.HtmlTable.*;
import static org.hamcrest.Matchers.*;




@DefaultUrl("/tables")
public class HTMLTablePage extends PageObject {
	
	@FindBy(id = "table2")
	protected WebElementFacade tab; 

//	Read Complete table as list of key value pairs
	
	public void readcompletetable() {
		
		open();
		getDriver().manage().window().maximize();
		List<Map<Object, String>>  listab 
		              = HtmlTable.rowsFrom(tab);
		
//		System.out.println(listab);
		
	}

//	Extract values on basis on certain conditions
	
	public void extractvalues() {
		
		open();
		getDriver().manage().window().maximize();
		List<WebElement> eln = filterRows(tab, the("Email",endsWith("yahoo.com"))   );

		for (WebElement e : eln) {
			
//			System.out.println(e.getText() );
		}
		
	}	                             

//	Extract headings 
	
	public void extractheadings() {
		
		open();
		getDriver().manage().window().maximize();
		
		List<String> heads = inTable(tab).getHeadings();
		
		for(String h : heads) {
			
//			System.out.println(h);
			
		}
		
	}

//	another way to Extract values on basis on certain conditions
	
	public void extractvaluesanother() {
		
		open();
		getDriver().manage().window().maximize();
//		List<WebElement> eln = filterRows(tab, the("Email",endsWith("yahoo.com"))   );

		List<WebElement> eln1 = inTable(tab).getRowElementsWhere(the("First Name" , equalTo("Frank") ));
		
		
		for (WebElement e : eln1) {
			
			System.out.println(e.getText() );
		}
		
	}	
	
//	Read Rows which do not have headings
	
        public void readtableifnoheader() {
		
		open();
		getDriver().manage().window().maximize();
		List<Map<Object, String>>  listab  = 
				withColumns("last-name" , "first-name" ,
				"email" ,"dues" , "web-site" , "mytest"  )
		.readRowsFrom(tab);
		
		System.out.println(listab);
		
	}
        
//        Check on certain values on the table 
        
        
        public void assertvalue() {
    		
    		open();
    		getDriver().manage().window().maximize();
    
    				inTable(tab).shouldHaveRowElementsWhere(
    						the("First Name" , equalTo("Frank")));
//    				getRowElementsWhere(the("First Name" , equalTo("Frank") ));
    		
    		
 
    	}    
        
        
        
        
        
        
        
        

	
	
}
