package dss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16 {
	
	static WebDriver driver;
	
	static WebElement ele;

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("8888");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String altmessege= driver.switchTo().alert().getText();
		
		System.out.println(">>" +altmessege);
		
		Thread.sleep(5000);
		
		alt.dismiss();
		
		
		
	}

}
