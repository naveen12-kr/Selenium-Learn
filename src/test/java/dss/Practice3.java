package dss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice3 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.silentOutput", "true");

		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement mytable = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody"));

		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));

		int row_count = rows_table.size();

		System.out.println("The size of row count is :" + row_count);

		for (int i = 1; i <row_count; i++) {
			
			String ss=rows_table.get(i).getText();
			
			System.out.println("The text is :"  +ss);

			List<WebElement> col_table = rows_table.get(i).findElements(By.tagName("td"));

			int col_count = col_table.size();

			//System.out.println("The size of col count is :" + col_count);
			 System.out.println("Number of cells In Row " + i + " are " + col_count);

		}

	}

}
