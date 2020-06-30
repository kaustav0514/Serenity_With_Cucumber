package com.jpetstore.Pages;

//Static import for tables

import static net.thucydides.core.matchers.BeanMatchers.*;
import static net.thucydides.core.pages.components.HtmlTable.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.jpetstore.Util.PetCategories;

import net.serenitybdd.screenplay.questions.converters.IntegerConverter;

public class ProductsPage extends BasePage {

	private static final String PRODUCT_TABLE = "//*[@id='Catalog']/table";

//  if multiple names are present in the table 
//	private static final String ANCHOR = "(//*[@id='Catalog']//table//td[normalize-space()='";

	private static final String ANCHOR = "//*[@id='Catalog']//table//td[normalize-space()='";

	private static final String PROCEED_TO_CHECK = "//a[contains( text() , 'Proceed to Checkout')]";

	public ProductsPage selectPetByName(PetCategories petcategory, String petname) {

		waitForTextToAppear(petcategory.getValue());

		List<WebElement> rows =

				inTable(findBy(PRODUCT_TABLE)).filterRows(the("Name", equalTo(petname)));

		rows.get(0).findElement(By.tagName("a")).click();

		return this;
	}

	public ProductsPage addToCartSpecificProduct(String specificProduct) {

		findBy(PRODUCT_TABLE).shouldContainText(specificProduct);

//		String addToCartP1 = "'])[1]//parent::tr//a[contains(@href , 'addItemToCart')]";

		String addToCartP1 = "']//parent::tr//a[contains(@href , 'addItemToCart')]";

		String addToCartButton = ANCHOR + specificProduct + addToCartP1;

		waitFor(addToCartButton).findBy(addToCartButton).click();

		return this;
	}

	public ProductsPage addToCartByViewItemDetails(String specificProduct, String... details) {

		findBy(PRODUCT_TABLE).shouldContainText(specificProduct);

//		String viewProductP1 = "'])[1]//parent::tr//a[contains(@href , 'viewItem')]";

		String viewProductP1 = "']//parent::tr//a[contains(@href , 'viewItem')]";

		String viewProductButton = ANCHOR + specificProduct + viewProductP1;

		waitFor(viewProductButton).findBy(viewProductButton).click();

		waitForAnyTextToAppear(details[0], details[1], details[2]);

		findBy("//a[@class='Button']").click();

		return this;
	}

	public ProductsPage selectProductFromSearchTable(String specificProduct) {

		String searchResultP1 = "']//parent::tr//img//parent::a";

		String searchResultLink = ANCHOR + specificProduct + searchResultP1;

		waitFor(searchResultLink).findBy(searchResultLink).click();

		return this;
	}

	public ProductsPage shoppingCart(String specificProduct, int quantity) {

		String quantityP1 = "']//following-sibling::td/input";

		String totalcostP1 = "']//following-sibling::td[4]";

		String quantityBox = ANCHOR + specificProduct + quantityP1;

		String totalCostLabel = ANCHOR + specificProduct + totalcostP1;

		if (quantity > 0) {

			Float totalValueBeforeUpdate = Float.valueOf(find(totalCostLabel).getText().substring(1));

			find(quantityBox).typeAndEnter(Integer.toString(quantity));

			Float totalValueAfterUpdate = Float.valueOf(find(totalCostLabel).getText().substring(1));

			if (totalValueAfterUpdate < totalValueBeforeUpdate) {

				return null;
			}

		}
		if (quantity == 0) {

			find(quantityBox).typeAndEnter(Integer.toString(quantity));

			waitForAbsenceOf(quantityBox).shouldNotBeVisible(By.xpath(quantityBox));
		}

		return this;
	}

	public boolean removeItemFromCart(String productName) {

		String removeButtonP1 = "']//following-sibling::td[5]/a";

		String removeButton = ANCHOR + productName + removeButtonP1;

		waitFor(removeButton).findBy(removeButton).click();

		return (!waitForAbsenceOf(removeButton).isElementVisible(By.xpath(removeButton)));

	}

	public OrdersPage clickonProceedToCheckoutBtn() {

		waitFor(PROCEED_TO_CHECK).find(PROCEED_TO_CHECK).click();

		return this.switchToPage(OrdersPage.class);

	}

}
