package com.lauchbrowser.fw;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindows {
	
	static WebDriver driver; 
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		
		driver.manage().window().maximize();
		
		multipleWindows();
		
	} 
	
	
	public static void multipleWindows() throws Throwable {
		
	 WebElement clickele=driver.findElement(By.xpath("//*[@id=\"button1\"]"));
	 
	 String parentWindow=driver.getWindowHandle();
	 
	 for (int i = 0; i < 3; i++) {
		 
		 clickele.click();
		 Thread.sleep(3000);
		
	}
	 
	 Set<String> allWindows= driver.getWindowHandles();
	 
	 for (String handle : allWindows) {
		 
		 System.out.println("The handle windows are:" +handle);
		 
		 System.out.println("The parrent windows are:" + parentWindow );
		
	}
	
	
		
		
	}
}
