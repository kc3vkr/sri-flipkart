package com.flipkart.object.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Realme2Mobile3GB32GBBlackPage {
	WebDriver driver;
	
	public Realme2Mobile3GB32GBBlackPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitForRealme2Mobile3GB32GBBlackPageTOLoad() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("container"))));
	}

}
