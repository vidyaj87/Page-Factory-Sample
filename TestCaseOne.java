package main;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class TestCaseOne extends Configure{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","D:\\VidyaWorks\\Automation\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
        // Create a new instance of the search page class and initialize any WebElement fields in it.
		homePage = PageFactory.initElements(driver, HomePage.class);
		indoorlightingpage = PageFactory.initElements(driver, IndoorLightingPage.class);
		homePage.navigateTo(driver);
		homePage.isHomePageCheck();
		homePage.clickShopByCategory();
		homePage.clickIndoorLighting();
		indoorlightingpage.isIndoorLightingPageCheck();
		System.out.println("End of Test script");
		driver.close();
		//driver.quit();
		
	
	}
}
