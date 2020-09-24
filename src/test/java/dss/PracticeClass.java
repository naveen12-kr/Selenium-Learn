package dss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeClass {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.silentOutput", "true");

		driver = new ChromeDriver();

		driver.get("https://qavm3");

		Thread.sleep(6000);
		
		driver.manage().window().maximize();

	}

}
