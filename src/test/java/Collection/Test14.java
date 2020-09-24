package Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		String user = "admin";

		String password = "ChangeMe";

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://qavm43");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(user);
		;

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='submit']")).click();

		driver.manage().window().maximize();

		boolean b = true;

		String s1 = "Dashboard";

		String ele = driver.findElement(By.xpath("//a[@class='active']")).getText();

		if (s1.equalsIgnoreCase(ele)) {

			System.out.println("The stataement" + b);

		} else {

			System.out.println("The stataement is false");

		}

	}

}
