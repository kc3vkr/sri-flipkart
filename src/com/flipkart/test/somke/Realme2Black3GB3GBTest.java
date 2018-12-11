package com.flipkart.test.somke;


import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.object.ui.FlipkartLoginPage;
import com.flipkart.object.ui.HomePage;
import com.flipkart.object.ui.Realme2Mobile3GB32GBBlackPage;
import com.flipkart.object.ui.Realme2SearchPage;
import com.flipkart.utils.CreateDriver;

public class Realme2Black3GB3GBTest {
	
	WebDriver driver;
	FlipkartLoginPage login;
	HomePage home;
	Realme2SearchPage realme2;
	Realme2Mobile3GB32GBBlackPage realme2Black;
	@BeforeMethod
	public void preCondition() {
	driver = CreateDriver.getDriverInstance();
	login = new FlipkartLoginPage(driver);
	home = new HomePage(driver);
	realme2 = new Realme2SearchPage(driver);
	realme2Black = new Realme2Mobile3GB32GBBlackPage(driver);
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@Test
	public void test4SearchRealme2() {
		login.waitForLoginPageToLoad();
		try {
		login.getEmailOrMobileNumberTextbox().sendKeys("veman.kc@gmail.com");
		login.getPasswordTextbox().sendKeys("vemanveman");
		login.getLoginButton().click();
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
		home.waitForHomePageToLoad();
		home.getSearchTextbox().sendKeys("realme2", Keys.ENTER);
		
		realme2.waitForRealme2SearchPageToLoad();
		try {
		realme2.getRealme2Black3GB32GB().isSelected();
		}
		
		catch(StaleElementReferenceException e) {
			e.printStackTrace();
		}
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Realme2 - Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		Assert.assertEquals(actualTitle, expectedTitle);
		realme2.getRealme2Black3GBRAM().click();
		
		realme2Black.waitForRealme2Mobile3GB32GBBlackPageTOLoad();
		/*String actualTitle2 = driver.getCurrentUrl();
		String expectedTitle2 = "Realme 2 (Diamond Black, 32 GB) Online at Best Price Only On Flipkart.com";
		Assert.assertEquals(actualTitle2, expectedTitle2);*/
		
	}		
	
}
