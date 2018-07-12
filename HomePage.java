package main;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Configure  {
	
	public static WebDriver driver;
	 public String PAGE_TITLE = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	 @FindBy(how = How.ID, using = "nav-link-shopall")
	 @CacheLookup
	 static WebElement shopByCategory;

	 @FindBy(how = How.LINK_TEXT, using = "Indoor Lighting")
	 @CacheLookup
	 static WebElement indoor_Lighting;
	 
	 public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }
	 public void clickShopByCategory()
	 {
		 shopByCategory.click();
		 System.out.println("Clicking shop by category");
	 }

	 public IndoorLightingPage clickIndoorLighting()
	 {
		 indoor_Lighting.click();
		 System.out.println("Logging to Indoor Lighting page.");
		 return PageFactory.initElements(driver, IndoorLightingPage.class);
	 }
	public void navigateTo(WebDriver driver) 
	{
		driver.get(BASE_URL+"");	
		System.out.println("Logged into the home page.");
	}

	public void isHomePageCheck()
	{
		if (PAGE_TITLE.equals(driver.getTitle()))
				{
			System.out.println("Verified the page title");
				}
		else
		{
			System.out.println("The page title does not match");	
		}
			
	}

}
