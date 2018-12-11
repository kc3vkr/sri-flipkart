package com.flipkart.test.somke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.object.ui.FlipkartLoginPage;
import com.flipkart.object.ui.HomePage;
import com.flipkart.object.ui.Realme2SearchPage;
import com.flipkart.utils.CreateDriver;

public class LoginPageSmokeTest {
	
	FlipkartLoginPage login;
	HomePage home;
	Realme2SearchPage realme2;
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void preCondition() {
	driver = CreateDriver.getDriverInstance();
	login = new FlipkartLoginPage(driver);
	home = new HomePage(driver);
	realme2 = new Realme2SearchPage(driver);
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@Test
	public void test1LoginPageTitle() {
		login.waitForLoginPageToLoad();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Exclusive Offers!";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void test2InvalidLogin() {
		login.getEmailOrMobileNumberTextbox().sendKeys("veman.kc@gmail.com");
		login.getPasswordTextbox().sendKeys("invalid");
		login.getLoginButton().click();
		
		String actualErrMsg = login.getLoginErrMsg().getText();
		String expectedErrMsg = "Your username or password is incorrect";
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
	
	@Test
	public void test3ValidLogin() {
		login.getEmailOrMobileNumberTextbox().sendKeys("veman.kc@gmail.com");
		login.getPasswordTextbox().sendKeys("vemanveman");
		login.getLoginButton().click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Exclusive Offers!";
		Assert.assertEquals(actualTitle, expectedTitle);	 
			
	}	
	
}
