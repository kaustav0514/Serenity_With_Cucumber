package sampletest;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import com.ibm.icu.impl.duration.TimeUnit;
  import static java.time.temporal.ChronoUnit.SECONDS;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;


@RunWith(SerenityRunner.class)
public class FirstTest extends PageObject{
	
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@FindBy(xpath ="//input[@placeholder='Search for Vegetables and Fruits']")
	WebElement searchbox;
	
	@Title("Logging to leaf page")
	@Test
	public void toLogin() {
		
		open();
		
//		driver.get("https://rahulshettyacademy.com/#/practice-project");
		getDriver().manage().window().maximize();
		
		System.out.println("Default Implicit wait :" + getImplicitWaitTimeout());
		System.out.println("Default Explicit wait :" + getWaitForTimeout());
		
//		setImplicitTimeout(10, SECONDS);
//		
//		setWaitForTimeout(15);
		
		
		
		System.out.println("Title of the page is " + getTitle()); 
		
//		getDriver().findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("Cucumber");
//		find(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("Cucumber");
//		$("//input[@placeholder='Search for Vegetables and Fruits']").sendKeys("Cucumber");
//		typeInto($("//input[@placeholder='Search for Vegetables and Fruits']"), "Cucumber");
		
//		typeInto(searchbox, "Cucumber");
		
		WebElementFacade search = find(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']"));
		
		search.type("Cucumber");
		
//		New implementation in serenity framework
//		search.isPresent(); 
		
//		search.typeAndEnter("Cucumber");
		
		
		
		

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
