package dss;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		String month = "April,2020";

		String day = "20";

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://phptravels.net/home");

		Thread.sleep(1000);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(5000);

		String ss = driver.findElement(By.xpath("//div[1]//nav[1]//div[2]")).getText();
		
		Thread.sleep(3000);

		System.out.println(">>>" + ss);
		
		Thread.sleep(3000);
		
		while(true) {
			
			if (ss.equalsIgnoreCase(month)) {
				
				break;
				
			} else {
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//body[@class='with-waypoint-sticky']/div[@id='datepickers-container']/div[1]/nav[1]/div[3]/*[1]")).click();
				
				

			}
			
		}

	}

}
