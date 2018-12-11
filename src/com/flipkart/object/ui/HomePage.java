package com.flipkart.object.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMyAccountLink() {
		return driver.findElement(By.linkText("MyAccount"));
	}
	public WebElement getSearchTextbox() {
		return driver.findElement(By.xpath("//div/input[@type='text']"));
	}
	
	public WebElement getSearchButton() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	public void waitForHomePageToLoad() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("container"))));		
	}	
	
}
