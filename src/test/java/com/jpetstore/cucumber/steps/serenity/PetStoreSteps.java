package com.jpetstore.cucumber.steps.serenity;

import com.jpetstore.Pages.AccountsPage;
import com.jpetstore.Pages.BasePage;
import com.jpetstore.Pages.DashBoardPage;
import com.jpetstore.Pages.HelpPage;
import com.jpetstore.Pages.LoginPage;
import com.jpetstore.Pages.OrdersPage;
import com.jpetstore.Pages.ProductsPage;
import com.jpetstore.Util.PetCategories;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PetStoreSteps extends ScenarioSteps {

	BasePage basepage;

	LoginPage loginpage;

	AccountsPage accountspage;

	DashBoardPage dashboardpage;

	ProductsPage productspage;
	
	OrdersPage ordersPage;

	/**
	 * BASE PAGE STEPS
	 */

	@Step("Signing out from the store")
	public DashBoardPage sign_out() {

		return basepage.sign_out();

	}

	@Step("Navigate to Login Page")
	public LoginPage navigate_to_signonPage() {

		return basepage.navigate_to_signonPage();

	}

	@Step("Navigate to Products Page by clicking on :{0} link on header")
	public ProductsPage navigateToProductCategory(PetCategories productCategory) {

		return basepage.navigateToProductCategory(productCategory);

	}

	@Step("Navigate to Products Page by clicking on shopping cart")
	public ProductsPage navaigateToShoppingCart() {

		return basepage.navaigateToShoppingCart();

	}

	@Step("Navigate to Help Page")
	public HelpPage navaigateToHelpPage() {

		return basepage.navaigateToHelpPage();

	}

	@Step("Clicking on company logo and navigating to Dashboard")
	public DashBoardPage navigate_to_dashBoardPage() {

		return basepage.navigate_to_dashBoardPage();

	}

	@Step("Navigate to Accounts Page")
	public AccountsPage navigatetoAccountPage() {

		return basepage.navigatetoAccountPage();

	}

	@Step("Searching for product: {0}")
	public ProductsPage searcForProduct(String searchValue) {

		return basepage.searcForProduct(searchValue);

	}

	/**
	 * Login Page STEPS
	 */
	@Step("Get Message on Invalid Login")
	public String getMessageOnInvalidLogin() {

		return loginpage.getMessageOnInvalidLogin();

	}

	@Step("Navigate to User Registration Page")
	public AccountsPage navigate_to_registrationPage() {

		return loginpage.navigate_to_registrationPage();

	}

	@Step("Login Into the application with username: {0} and password: {1}")
	public DashBoardPage doLogin(String username, String password) {

		basepage.click_on_signonPage();
		return loginpage.doLogin(username, password);

	}

	/**
	 * Accounts/Registration Page STEPS
	 */

	@Step("Registering new user with username: {0} and password: {1}")
	public AccountsPage addNewUSerInfo(String username, String password, String repeatpassword) {

		return accountspage.addNewUSerInfo(username, password, repeatpassword);

	}

	@Step("Adding details to Account Information")
	public AccountsPage addAccountInfo(String firstname, String lastname, String email, String phone, String add1,
			String add2, String city, String state, String zip, String country) {

		return accountspage.addAccountInfo(firstname, lastname, email, phone, add1, add2, city, state, zip, country);

	}

	@Step("Adding details to Profile Information")
	public AccountsPage addProfileInfo(String language, String category, boolean mylist, boolean banner) {

		return accountspage.addProfileInfo(language, category, mylist, banner);

	}

	@Step("Click the button to save account information")
	public DashBoardPage clickSaveaccountInfo() {

		return accountspage.clickSaveaccountInfo();

	}

	/**
	 * DashBoard Page STEPS
	 */

	@Step("Get the Greeting message once user is successfully logged in")
	public String getGreetingMsg() {

		return dashboardpage.getGreetingMsg();

	}

	@Step("Select Product: {0} from SideBar ")
	public ProductsPage selectProductsFromSideBarDisplay(PetCategories petCategories) {

		return dashboardpage.selectProductsFromSideBarDisplay(petCategories);

	}

	@Step("Select Product: {0} from Centre Image Display ")
	public ProductsPage selectProductsFromCentreImageDisplay(PetCategories petCategories) {

		return dashboardpage.selectProductsFromCentreImageDisplay(petCategories);

	}

	/**
	 * *********************************************
	 * 
	 * Products Page STEPS
	 * 
	 * *************************************
	 */

	@Step("Select a pet with PetCategory:{0} and petName:{1}")
	public ProductsPage selectPetByName(PetCategories petcategory, String petname) {

		return productspage.selectPetByName(petcategory, petname);

	}

	@Step("Adding {0} to the shopping cart ")
	public ProductsPage addToCartSpecificProduct(String specificProduct) {

		return productspage.addToCartSpecificProduct(specificProduct);

	}
	
	@Step("Select pet:{0} by viewing details and adding it to Cart")
	 public ProductsPage addToCartByViewItemDetails(String specificProduct,
    		 String...details) {
		 
		 return productspage.addToCartByViewItemDetails(specificProduct, details);
		 
	 }
	
	@Step("Selecting {0} from search results ")
	 public ProductsPage selectProductFromSearchTable(String specificProduct) {
		 
		 return productspage.selectProductFromSearchTable(specificProduct);
	 }

	@Step("Interacting with shopping cart ")
	public ProductsPage shoppingCart(String specificProduct , int quantity) {
		
		return productspage.shoppingCart(specificProduct, quantity);
	}

	@Step("Removing item {0} from shopping cart")
	public boolean removeItemFromCart(String productName) {
		
	return productspage.removeItemFromCart(productName);	
	
	}
	
	@Step("Click on proceed to checkout")
	public OrdersPage clickonProceedToCheckoutBtn() {
		
		return productspage.clickonProceedToCheckoutBtn();
	}
	
	
	/**
	 * *********************************************
	 * 
	 * Orders Page STEPS
	 * 
	 * *************************************
	 */
	@Step("Enter Payment and Billing Details")
	public OrdersPage enterPaymentAndBillingdetails(String cardType,String cardNumber,String expDate,
			String firstName,String lastName,
			String add1,String add2,
			String city,String state,
			String zip,String country) {
		
		
		return ordersPage.enterPaymentAndBillingdetails(cardType, cardNumber, expDate, 
				firstName, lastName, add1, add2, city, state, zip, country);
	}
	
	@Step("Click Ship To Different Address Checkbox")
	public OrdersPage clickShipToDifferentAddress(boolean checkbox) {
		
		
		return ordersPage.clickShipToDifferentAddress(checkbox);
	}
	
	@Step("Enter Click on Continue Button")
	 public OrdersPage clickOnContinueButton() {
		 
		 return ordersPage.clickOnContinueButton();
	 }
	 
	@Step("Enter Shipping Info")
	 public OrdersPage enterShippingInfo(String firstName,String lastName,
	 			String add1,String add2,
	 			String city,String state,
	 			String zip,String country) {
		 
		 return ordersPage.enterShippingInfo(firstName, lastName, add1, add2, city, state, zip, country);
	 }
	
	@Step("Click on Confirm Button")
	 public OrdersPage clickOnConfirmButton() {
		 
		 return ordersPage.clickOnConfirmButton();
	 }
	 
	@Step("Verify Order Submitted message is displayed")
	 public void verifyOrderSubmitted() {
		 
		 ordersPage.verifyOrderSubmitted();
	 }

	
}
