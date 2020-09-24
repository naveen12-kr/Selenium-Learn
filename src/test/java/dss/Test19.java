package dss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test19 {

	
		
		static WebDriver driver;

		static WebElement ele;

		public static void main(String[] args) throws Throwable {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.get("https://qavm41/");

			Thread.sleep(5000);

			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");

			driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("ChangeMe");

			driver.findElement(By.xpath("//input[@id='submit']")).click();

			driver.manage().window().maximize();

			Thread.sleep(3000);
			
			labelTable();

	}
		
		public static void labelTable() throws Throwable {

			driver.findElement(By.xpath("//a[@class='configuration']")).click();

			Thread.sleep(3000);

			driver.findElement(By.xpath("//a[contains(text(),'Legal Holds')]")).click();
		
			WebElement table=driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div[2]/div/table/tbody"));
			
			List<WebElement> row_table=table.findElements(By.tagName("tr"));
			
			int row_count=row_table.size();
			
			System.out.println("The size of row is :" +row_count );
			
			for (int row = 1; row <=row_count ; row++) {
				
				String actual= "//*[@id=\"main\"]/div[4]/div/div[2]/div/table/tbody/tr[" + row + "]/td[3]/a";
				
				ele= driver.findElement(By.xpath(actual));
				
				
				
				System.out.println(">>>>" + row_table.get(row).getText() );
				
				ele.click();
				
				driver.findElement(By.xpath("//h3[@id='schedBar']")).click();
				
				
				
				
				
			}

		}
}