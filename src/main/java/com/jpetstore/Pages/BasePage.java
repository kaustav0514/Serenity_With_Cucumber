package com.jpetstore.Pages;

import org.openqa.selenium.By;

import com.jpetstore.Util.PetCategories;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

	private static final String ENTER_THE_STORE_LINK = "//a[@href='actions/Catalog.action']";

	private static final String SIGN_IN_LINK = "div[id=MenuContent] a[href$='?signonForm=']";

	private static final String LOGO_LINK = "div[id='LogoContent'] a[href$='.action']";

	private static final String SIGN_OUT_LINK = "//a[@href='/actions/Account.action?signoff=']";

	private static final String MY_ACCOUNT_LINK = "//a[@href='/actions/Account.action?editAccountForm=']";

	private static final String PRODUCT_SEARCH_BAR = "//input[@name='keyword']";

	private static final String SEARCH_BUTTON = "//input[@value='Search']";

	private static final String HELP_LINK = "//a[@href='../help.html']";

	private static final String SHOPPING_CART_LINK = "div[id='MenuContent'] a[href$='?viewCart=']";

	// Product quick links

	private static final String FISH_LINK = "div[id='QuickLinks'] a[href$='FISH']";

	private static final String DOGS_LINK = "div[id='QuickLinks'] a[href$='DOGS']";

	private static final String REPTILES_LINK = "div[id='QuickLinks'] a[href$='REPTILES']";

	private static final String CATS_LINK = "div[id='QuickLinks'] a[href$='CATS']";

	private static final String BIRDS_LINK = "div[id='QuickLinks'] a[href$='BIRDS']";

//	USE SHIFT --ALT -- J for generating comment block

	/**
	 * @return
	 */
	public LoginPage navigate_to_signonPage() {
		
		open();
		
		getDriver().manage().window().maximize();

		waitForTextToAppear("Welcome to JPetStore 6");

		waitFor(ENTER_THE_STORE_LINK).findBy(ENTER_THE_STORE_LINK).click();

		waitFor(SIGN_IN_LINK).findBy(SIGN_IN_LINK).click();

		return this.switchToPage(LoginPage.class);

	}

	public LoginPage click_on_signonPage() {

		waitFor(SIGN_IN_LINK).findBy(SIGN_IN_LINK).click();

		return this.switchToPage(LoginPage.class);

	}

	public DashBoardPage navigate_to_dashBoardPage() {

		waitFor(LOGO_LINK).findBy(LOGO_LINK).click();

		return this.switchToPage(DashBoardPage.class);

	}

	public DashBoardPage sign_out() {

		waitFor(SIGN_OUT_LINK).findBy(SIGN_OUT_LINK).click();
		
		waitForAbsenceOf(SIGN_OUT_LINK).shouldNotBeVisible(By.xpath(SIGN_OUT_LINK));
		
		return this.switchToPage(DashBoardPage.class);

	}

	public AccountsPage navigatetoAccountPage() {

		waitFor(MY_ACCOUNT_LINK).findBy(MY_ACCOUNT_LINK).click();

		return this.switchToPage(AccountsPage.class);

	}

	public ProductsPage searcForProduct(String searchValue) {

		waitFor(PRODUCT_SEARCH_BAR).findBy(PRODUCT_SEARCH_BAR).sendKeys(searchValue);

		waitFor(SEARCH_BUTTON).findBy(SEARCH_BUTTON).click();

		return this.switchToPage(ProductsPage.class);
	}

	public HelpPage navaigateToHelpPage() {

		waitFor(HELP_LINK).findBy(HELP_LINK).click();

		return this.switchToPage(HelpPage.class);
	}

	public ProductsPage navaigateToShoppingCart() {

		waitFor(SHOPPING_CART_LINK).findBy(SHOPPING_CART_LINK).click();

		return this.switchToPage(ProductsPage.class);
	}

	public ProductsPage navigateToProductCategory(PetCategories productCategory) {

		switch (productCategory) {

		case FISH:

			waitFor(FISH_LINK).findBy(FISH_LINK).click();
			return this.switchToPage(ProductsPage.class);

		case CATS:

			waitFor(CATS_LINK).findBy(CATS_LINK).click();
			return this.switchToPage(ProductsPage.class);

		case DOGS:

			waitFor(DOGS_LINK).findBy(DOGS_LINK).click();
			return this.switchToPage(ProductsPage.class);

		case REPTILES:

			waitFor(REPTILES_LINK).findBy(REPTILES_LINK).click();
			return this.switchToPage(ProductsPage.class);

		case BIRDS:

			waitFor(BIRDS_LINK).findBy(BIRDS_LINK).click();
			return this.switchToPage(ProductsPage.class);

		default:
			break;

		}
		
		return null;

	}

}
