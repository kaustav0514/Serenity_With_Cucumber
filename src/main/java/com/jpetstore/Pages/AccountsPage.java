package com.jpetstore.Pages;

public class AccountsPage extends BasePage {

	private static final String USERNAME = "//input[@name='username']";

	private static final String PASSWORD = "//input[@name='password']";

	private static final String REPEAT_PASSWORD = "//input[@name='repeatedPassword']";

	private static final String FIRST_NAME = "//input[@name='account.firstName']";

	private static final String LAST_NAME = "//input[@name='account.lastName']";

	private static final String EMAIL = "//input[@name='account.email']";

	private static final String PHONE = "//input[@name='account.phone']";

	private static final String ADDRESS1 = "//input[@name='account.address1']";

	private static final String ADDRESS2 = "//input[@name='account.address2']";

	private static final String CITY = "//input[@name='account.city']";

	private static final String STATE = "//input[@name='account.state']";

	private static final String ZIP = "//input[@name='account.zip']";

	private static final String COUNTRY = "//input[@name='account.country']";

	private static final String LANGUAGE_PREFERENCE_DROPDOWN = "//select[@name='account.languagePreference']";

	private static final String FAVOURITE_CATEGORY_DROPDOWN = "//select[@name='account.favouriteCategoryId']";

	private static final String ENABLE_MYLIST_CHECKBOX = "//input[@name='account.listOption']";

	private static final String ENABLE_MYBANNER_CHECKBOX = "//input[@name='account.bannerOption']";

	private static final String SAVE_ACCOUNT_INFO_BOX = "//input[@name='newAccount']";

	public AccountsPage addNewUSerInfo(String username, String password, String repeatpassword) {

		waitForTextToAppear("User Information");

		waitFor(USERNAME).findBy(USERNAME).type(username);
		waitFor(PASSWORD).findBy(PASSWORD).type(password);
		waitFor(REPEAT_PASSWORD).findBy(REPEAT_PASSWORD).type(repeatpassword);

		return this;

	}

	public AccountsPage addAccountInfo(String firstname, String lastname, String email, String phone, String add1,
			String add2, String city, String state, String zip, String country) {

		waitForTextToAppear("Account Information");

		waitFor(FIRST_NAME).findBy(FIRST_NAME).type(firstname);
		waitFor(LAST_NAME).findBy(LAST_NAME).type(lastname);
		waitFor(EMAIL).findBy(EMAIL).type(email);
		waitFor(PHONE).findBy(PHONE).type(phone);
		waitFor(ADDRESS1).findBy(ADDRESS1).type(add1);
		waitFor(ADDRESS2).findBy(ADDRESS2).type(add2);
		waitFor(CITY).findBy(CITY).type(city);
		waitFor(STATE).findBy(STATE).type(state);
		waitFor(ZIP).findBy(ZIP).type(zip);
		waitFor(COUNTRY).findBy(COUNTRY).type(country);
		
		
		return this;

	}
	
	public AccountsPage addProfileInfo(String language, String category, boolean mylist, boolean banner ) {

		waitForTextToAppear("Profile Information");

		waitFor(LANGUAGE_PREFERENCE_DROPDOWN).selectFromDropdown($(LANGUAGE_PREFERENCE_DROPDOWN), language);
		waitFor(FAVOURITE_CATEGORY_DROPDOWN).selectFromDropdown($(FAVOURITE_CATEGORY_DROPDOWN), category);
		waitFor(ENABLE_MYLIST_CHECKBOX).setCheckbox($(ENABLE_MYLIST_CHECKBOX), mylist);
		
		evaluateJavascript("window.scrollBy(0,100)");
		waitFor(ENABLE_MYBANNER_CHECKBOX).setCheckbox($(ENABLE_MYBANNER_CHECKBOX), banner);

		return this;

	}
	
	public DashBoardPage clickSaveaccountInfo() {

		
		findBy(SAVE_ACCOUNT_INFO_BOX).click();


		return this.switchToPage(DashBoardPage.class);

	}

}
