package com.flipkart.object.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLoginPage {
	WebDriver driver;
	
	public FlipkartLoginPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	public WebElement getEmailOrMobileNumberTextbox() {
		return driver.findElement(By.xpath("//form/div/input[@type='text']"));
	}
	public WebElement getPasswordTextbox() {
		return driver.findElement(By.cssSelector("input[type='password']"));
	}
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//form/div/button[@type='submit']"));
	}
	public WebElement getLoginErrMsg() {
		return driver.findElement(By.xpath("//span[contains(text(),'Your username or password')]"));
	}
	public void waitForLoginPageToLoad() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("container"))));
	}
	
}
