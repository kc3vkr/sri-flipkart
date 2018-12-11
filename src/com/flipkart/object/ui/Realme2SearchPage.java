package com.flipkart.object.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Realme2SearchPage {
	
	WebDriver driver;
	
	public Realme2SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getRealme2Black3GB32GB() {
		return driver.findElement(By.xpath("//a[div[div[div[text()='Realme 2 (Diamond Black, 32 GB)']]]]/div/div/div/span/div/label/input[@type='checkbox']"));
	}
	
	public WebElement getRealme2Black3GBRAM(){
		return driver.findElement(By.xpath("//div[text()='Realme 2 (Diamond Black, 32 GB)']"));
	}
	
	public void waitForRealme2SearchPageToLoad() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("container"))));
	}
		
}
