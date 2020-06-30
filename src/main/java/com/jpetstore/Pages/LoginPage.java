package com.jpetstore.Pages;

public class LoginPage extends BasePage {
	
	private static final String USERNAME = "//input[@name='username']";
	
	private static final String PASSWORD = "//input[@name='password']";
	
	private static final String LOGIN_BUTTON = "//input[@name='signon']";
	
	private static final String REGISTER_NOW_LINK = "//*[@id='Catalog']//a[contains(text(),'Register Now!')]";
	
	private static final String INVALID_LOGIN_LABEL = "//*[@id='Content']//ul/li";
	
	
	public DashBoardPage doLogin(String username,String password) {
		
      waitForTextToAppear("Please enter your username and password.");
      
      waitFor(USERNAME).findBy(USERNAME).type(username);
      waitFor(PASSWORD).findBy(PASSWORD).type(password);
      waitFor(LOGIN_BUTTON).findBy(LOGIN_BUTTON).click();
      
		return this .switchToPage(DashBoardPage.class);
		
	}
	
   public AccountsPage navigate_to_registrationPage() {
	   
	      waitForTextToAppear("Please enter your username and password.");
	      waitFor(REGISTER_NOW_LINK).findBy(REGISTER_NOW_LINK).click();
	      
	   return this.switchToPage(AccountsPage.class);
	   
   }
	
   public String getMessageOnInvalidLogin() {
	   
	   return waitFor(INVALID_LOGIN_LABEL).findBy(INVALID_LOGIN_LABEL).getText();
	   
   }
	
	
	

}
