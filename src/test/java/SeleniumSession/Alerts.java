package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		
		System.out.println(alt.getText());
		Thread.sleep(3000);
		
		alt.accept();
		
		
		
		

	}

}
