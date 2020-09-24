package dss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.silentOutput", "true");

		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));

		int a = row.size();

		System.out.println("the size" + a);

		for (int i = 0; i < a; i++) {

			System.out.println("The text:" + row.get(i).getText());

		}

		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th"));

		int col_size = col.size();

		System.out.println("the size of col:" + col_size);

		for (int j = 0; j < col_size; j++) {

			System.out.println("The text of col:" + col.get(j).getText());

		}

	}

}
