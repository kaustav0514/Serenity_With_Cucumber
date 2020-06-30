package com.jpetstore.Pages;

public class OrdersPage extends BasePage {
	
	private static final String BILL_FIRST_NAME = "//*[@id='Catalog']//input[@name = 'order.billToFirstName']";

	private static final String BILL_LAST_NAME = "//*[@id='Catalog']//input[@name = 'order.billToLastName']";

	private static final String BILL_ADDRESS1 = "//*[@id='Catalog']//input[@name = 'order.billAddress1']";

	private static final String BILL_ADDRESS2 = "//*[@id='Catalog']//input[@name = 'order.billAddress2']";

	private static final String BILL_CITY = "//*[@id='Catalog']//input[@name = 'order.billCity']";

	private static final String BILL_STATE = "//*[@id='Catalog']//input[@name = 'order.billState']";

	private static final String BILL_ZIP = "//*[@id='Catalog']//input[@name = 'order.billZip']";

	private static final String BILL_COUNTRY = "//*[@id='Catalog']//input[@name = 'order.billCountry']";

	private static final String CARD_TYPE = "//*[@id='Catalog']//select[@name = 'order.cardType']";

	private static final String CARD_NUMBER = "//*[@id='Catalog']//input[@name = 'order.creditCard']";

	private static final String EXP_DATE = "//*[@id='Catalog']//input[@name = 'order.expiryDate']";
	
	private static final String SHIP_TO_DIFFRNT = "//input[@name = 'shippingAddressRequired']";

	private static final String CONTNU_BTN = "//*[@id='Catalog']//input[@value= 'Continue']";

// Shipping Page Locators
	
	private static final String SHIP_FIRST_NAME = "//*[@id='Catalog']//input[@name = 'order.shipToFirstName']";

	private static final String SHIP_LAST_NAME = "//*[@id='Catalog']//input[@name = 'order.shipToLastName']";

	private static final String SHIP_ADDRESS1 = "//*[@id='Catalog']//input[@name = 'order.shipAddress1']";

	private static final String SHIP_ADDRESS2 = "//*[@id='Catalog']//input[@name = 'order.shipAddress2']";

	private static final String SHIP_CITY = "//*[@id='Catalog']//input[@name = 'order.shipCity']";

	private static final String SHIP_STATE = "//*[@id='Catalog']//input[@name = 'order.shipState']";

	private static final String SHIP_ZIP = "//*[@id='Catalog']//input[@name = 'order.shipZip']";

	private static final String SHIP_COUNTRY = "//*[@id='Catalog']//input[@name = 'order.shipCountry']";

	
	private static final String CONFIRM_BTN = "a[href*='confirmed']";
	
	private static final String ORDER_CONFRM_LABEL = "//*[@id='Content']/ul/li";
	
	
	
	public OrdersPage enterPaymentAndBillingdetails(String cardType,String cardNumber,String expDate,
			String firstName,String lastName,
			String add1,String add2,
			String city,String state,
			String zip,String country) {
		
		waitForAnyTextToAppear("Payment Details" , "Billing Address");
		selectFromDropdown(find(CARD_TYPE), cardType);
		find(CARD_NUMBER).type(cardNumber);
		find(EXP_DATE).type(expDate);
		find(BILL_FIRST_NAME).type(firstName);
		find(BILL_LAST_NAME).type(lastName);
		find(BILL_ADDRESS1).type(add1);
		find(BILL_ADDRESS2).type(add2);
		find(BILL_CITY).type(city);
		find(BILL_STATE).type(state);
		find(BILL_ZIP).type(zip);
		find(BILL_COUNTRY).type(country);

		return this;
	}
	
	public OrdersPage clickShipToDifferentAddress(boolean checkbox) {
		
		waitForTextToAppear("Ship to different address...");
		
		setCheckbox(find(SHIP_TO_DIFFRNT) , checkbox);
		
		return this;
	}
	
     public OrdersPage clickOnContinueButton() {
		
		waitFor(CONTNU_BTN).find(CONTNU_BTN).click();
		
		return this;
	}
	
     public OrdersPage enterShippingInfo(String firstName,String lastName,
 			String add1,String add2,
 			String city,String state,
 			String zip,String country) {
 		
    	find(SHIP_FIRST_NAME).type(firstName);
 		find(SHIP_LAST_NAME).type(lastName);
 		find(SHIP_ADDRESS1).type(add1);
 		find(SHIP_ADDRESS2).type(add2);
 		find(SHIP_CITY).type(city);
 		find(SHIP_STATE).type(state);
 		find(SHIP_ZIP).type(zip);
 		find(SHIP_COUNTRY).type(country);
 		
 		return this;
 	}
     
     public OrdersPage clickOnConfirmButton() {
 		
 		waitForTextToAppear("Please confirm the information below and then press continue...");
    	 
    	 waitFor(CONFIRM_BTN).find(CONFIRM_BTN).click();
 		
 		return this;
 	}
     
     public void verifyOrderSubmitted() {
  		
  		waitFor(ORDER_CONFRM_LABEL).shouldContainText("Thank you, your order has been submitted.");
		evaluateJavascript("window.scrollBy(0,1000)");

     	 
  	}
     
     

 }












