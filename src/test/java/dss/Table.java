package dss;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();

		WebElement ele2 = driver.findElement(By.xpath("//span[@id='spanMessage']"));

		String ss = ele2.getText();

		System.out.println("The msg display::" + ss);

		if (ss.equalsIgnoreCase("Invalid credentials")) {

			driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();

			boolean b = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]")).isDisplayed();

			System.out.println("The forget pwd msg::" + b);

			boolean b1 = driver.findElement(By.xpath("//label[contains(text(),'OrangeHRM Username')]")).isEnabled();

			System.out.println("The field is enable::" + b1);
		}

		adminMenu();

	}

	public static void adminMenu() throws Throwable {

		Thread.sleep(3000);

		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		Thread.sleep(3000);

		List<WebElement> table = driver.findElements(By.xpath("//form[1]/div[4]/table[1]/tbody[1]/tr/td[2]"));
		int a = table.size();

		System.out.println(">>>>" + a);
		for (int i = 0; i < a; i++) {

			String str = table.get(i).getText();

			System.out.println("The text of ::" + str);

			if (str.equalsIgnoreCase("fiona.grace")) {

				System.out.println(">>>>>" + table.get(i).getText());
				Thread.sleep(3000);
				WebElement ele = table.get(i);
				ele.click();

				break;

			}

		}

	}

}
