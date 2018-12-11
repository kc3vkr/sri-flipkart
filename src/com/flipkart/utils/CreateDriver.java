package com.flipkart.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateDriver {
	
	public static WebDriver getDriverInstance() {
		WebDriver driver = null;
		String browser = DataHandlers.getDataFromProperties("./config-data/configuaration.properties", "browser");
		String url = DataHandlers.getDataFromProperties("./config-data/configuaration.properties", "url");
		
		if(browser.equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.gecko.driver", "./browser-servers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase(browser)){
			System.setProperty("webdriver.chrome.driver", "./browser-servers/geckodriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.err.println("-----Invalid Browser Option -----");
			return driver;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);		
		return driver;
	}

}
