package com.lauchbrowser.fw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoConstructor {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		List<WebElement> ltr = driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));

		int size = ltr.size();

		System.out.println("The size of list" + size);
		
		
		
		for (WebElement ee : ltr) {
			
			String s1=ee.getText();
			
			
			System.out.println(">>>>>" + s1);
			
		}

	}

}