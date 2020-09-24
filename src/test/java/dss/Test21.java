package dss;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test21 {
	
	static WebDriver driver;
	
	static WebElement ele;

	public static void main(String[] args) throws Throwable {
	
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/");
		
		Thread.sleep(9000);
		
		
		
 driver.findElement(By.xpath("/html/body/header/div[4]/div/div[2]/ul[1]/li")) ;
		
		
			
			String ss=ele.getText();
			
			System.out.println(">>>>" + ss);
			
			
		
		
		
		
		

	}

}
