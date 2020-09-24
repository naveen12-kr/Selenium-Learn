package com.lauchbrowser.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver driver;

	public static void ChromeBrowser(String url) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(url);

	}
	
	public static void clickEle() {
		
		
		
	}

}
