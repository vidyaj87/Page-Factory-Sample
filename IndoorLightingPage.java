package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IndoorLightingPage extends Configure {

	
	public static WebDriver driver;
	public String PAGE_TITLE = "Lights Store: Buy indoor lighting products Online at Best Prices in India | Browse list of indoor lights at Amazon.in";
	 
	 @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[4]/div/div[1]/div/div[1]/div[3]/h2/span")
	 @CacheLookup
	 static WebElement clearanceSale;
	
	 public IndoorLightingPage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 public void isIndoorLightingPageCheck() 
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


