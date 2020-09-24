package dss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {

	static WebDriver driver;

	static WebElement ele;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://qa-aws-2.intradyn.com/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("ChangeMe");

		driver.findElement(By.xpath("//input[@id='submit']")).click();

		driver.manage().window().maximize();

		Thread.sleep(3000);

		tableSearch();

	}

	public static void tableSearch() throws Throwable {

		driver.findElement(By.xpath("//span[contains(text(),'Configuration')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Tags')]")).click();

		WebElement table = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div[2]/div/table/tbody"));

		List<WebElement> row_table = table
				.findElements(By.xpath("//*[@id=\"main\"]/div[3]/div/div[2]/div/table/tbody/tr/td[4]"));

		int row_count = row_table.size();

		System.out.println("The size of list is ::" + row_count);

		for (int row = 1; row < row_count; row++) {

//			List<WebElement> col_row=row_table.get(row).findElements(By.tagName("td"));
//			
//			int col_count=col_row.size();
//			
//			System.out.println("Number of cells In Row " + row + " are " + col_count);
//			
//			for (int col = 0; col <col_count ; col++) {
//				
//				String cell_text= col_row.get(col).getText();
//				
//				System.out.println("Cell Value Of row number " + row + " and column number " + col + " Is " + cell_text);
//				
//			}

			row_table.get(row).click();

			Thread.sleep(5000);

			String ss = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();

			System.out.println("?????" + ss);

			Thread.sleep(3000);

			driver.findElement(By.xpath("//*[@id=\"schedBar\"]")).click();

		}

	}
}
