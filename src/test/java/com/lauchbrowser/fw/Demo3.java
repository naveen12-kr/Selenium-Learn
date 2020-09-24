package com.lauchbrowser.fw;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.silentOutput", "true");

		driver = new ChromeDriver();

		driver.get("https://www.edureka.co/community/");
		
		driver.manage().window().maximize();

		Thread.sleep(5000);
        
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,400)");

		
		multipleWindows();

	}
	
	public static void multipleWindows() throws Throwable {
		
		 WebElement clickele=driver.findElement(By.xpath("//*[@id=\"nav\"]/div[1]/div[2]/div/a[1]/img"));
		 
		 clickele.click();
		 
		 String parentWindow=driver.getWindowHandle();
		
		 System.out.println(">>>>>>>The parent" + parentWindow);
		
		 Set<String> allWindows= driver.getWindowHandles();
		 
	Iterator<String> itrWindows	= allWindows.iterator();
	
	while (itrWindows.hasNext()) {
		
		String ChildWindow =  itrWindows.next();
		
		if (!parentWindow.equals(ChildWindow)) {
			
			WebDriver ss=driver.switchTo().window(ChildWindow);
			
			System.out.println(">>>" + ss.getTitle());
			
			Thread.sleep(3000);
			
			driver.close();
			
		} 
		
		driver.switchTo().window(parentWindow);
		
	}
			
		

}
}