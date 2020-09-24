package dss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test15 {
	
	static WebDriver driver;
	
	static WebElement ele;

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/upload/");
		
		ele=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		
		ele.sendKeys("C://Users/ss/Desktop/Course details of Manual Testing1.pdf");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).submit();
		
		
		

	}

}
