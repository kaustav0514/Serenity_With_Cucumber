package com.jpetstore.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.time.temporal.ChronoUnit.SECONDS;
import com.jpetstore.Util.PetCategories;

import net.serenitybdd.screenplay.waits.WaitUntil;

public class DashBoardPage extends BasePage {

	private static final String GREETING_MSG = "//div[@id='WelcomeContent']";

//	PRODUCTS LINK SIDEBAR DISPLAY

	private static final String SIDEBAR_FISH = "//div[@id='SidebarContent']/a[contains(@href ,  'FISH')]";

	private static final String SIDEBAR_DOGS = "//div[@id='SidebarContent']/a[contains(@href ,  'DOGS')]";

	private static final String SIDEBAR_CATS = "//div[@id='SidebarContent']/a[contains(@href ,  'CATS')]";

	private static final String SIDEBAR_REPTILES = "//div[@id='SidebarContent']/a[contains(@href ,  'REPTILES')]";

	private static final String SIDEBAR_BIRDS = "//div[@id='SidebarContent']/a[contains(@href ,  'BIRDS')]";

//	PRODUCTS LINK CENTRE DISPLAY

	private static final String CENTRE = "div[id='MainImageContent'] area[href$='BIRDS']:nth-child(1)";

	private static final String CENTRE_FISH = "div[id='MainImageContent'] area[href$='FISH']";

	private static final String CENTRE_DOGS = "div[id='MainImageContent'] area[href$='DOGS']";
	
//	private static final String CENTRE_DOGS = "//map[@name='estoremap']//area[contains(@href, 'DOGS')]";
	
	private static final String CENTRE_REPTILES = "div[id='MainImageContent'] area[href$='REPTILES']";

	private static final String CENTRE_CATS = "div[id='MainImageContent'] area[href$='CATS']";

	private static final String CENTRE_BIRDS = "div[id='MainImageContent'] area[href$='CATS']+area[href$='BIRDS']";

	public String getGreetingMsg() {

		return waitFor(GREETING_MSG).findBy(GREETING_MSG).getText();

	}
//  Select a pet category from side bar
	public ProductsPage selectProductsFromSideBarDisplay(PetCategories petCategories) {

		switch (petCategories) {
		case FISH:

			waitFor(SIDEBAR_FISH).$(SIDEBAR_FISH).click();
			return this.switchToPage(ProductsPage.class);

		case DOGS:

			waitFor(SIDEBAR_DOGS).$(SIDEBAR_DOGS).click();
			return this.switchToPage(ProductsPage.class);

		case CATS:

			waitFor(SIDEBAR_CATS).$(SIDEBAR_CATS).click();
			return this.switchToPage(ProductsPage.class);
		case REPTILES:

			waitFor(SIDEBAR_REPTILES).$(SIDEBAR_REPTILES).click();
			return this.switchToPage(ProductsPage.class);
		case BIRDS:

			waitFor(SIDEBAR_BIRDS).$(SIDEBAR_BIRDS).click();
			return this.switchToPage(ProductsPage.class);

		default:
			break;
		}

		return null;

	}
	
//  Select a pet category from center image
	public ProductsPage selectProductsFromCentreImageDisplay(PetCategories petCategories) {

		switch (petCategories) {
		case FISH:

			waitFor(CENTRE_FISH).$(CENTRE_FISH).click();
			return this.switchToPage(ProductsPage.class);

		case DOGS:
            
			if((getDriver().toString()).contains("Firefox")) {
				
				System.out.println("Driver 1  .... "+getDriver().toString());
				waitFor(CENTRE_DOGS);
				withAction().moveToElement(findBy(CENTRE_DOGS)).click().perform();
				
				
			}else {
				
				System.out.println("Driver 2.... "+getDriver().toString());
				waitFor(CENTRE_DOGS).
				find(CENTRE_DOGS).click();
				
			}
		
			
			return this.switchToPage(ProductsPage.class);

		case CATS:

			waitFor(CENTRE_CATS).$(CENTRE_CATS).click();
			return this.switchToPage(ProductsPage.class);
		case REPTILES:

			waitFor(CENTRE_REPTILES).$(CENTRE_REPTILES).click();
			return this.switchToPage(ProductsPage.class);
		case BIRDS:

			waitFor(CENTRE_BIRDS).$(CENTRE_BIRDS).click();
			return this.switchToPage(ProductsPage.class);

		default:
			break;
		}

		return null;

	}


}
