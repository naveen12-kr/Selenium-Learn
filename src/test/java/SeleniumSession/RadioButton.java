package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");

		driver.manage().window().maximize();

		List<WebElement> radioele = driver.findElements(By.xpath("//input[@name='webform' and @type='radio']"));

		int a = radioele.size();

		System.out.println(">>>>" + a);

		String s = "Option 2";

		for (int i = 0; i < a; i++) {

			Thread.sleep(5000);

			WebElement ele = radioele.get(i);
			Thread.sleep(5000);
			String ss = ele.getAttribute("value");

			System.out.println(">>>>" + ss);

			if (ss.equalsIgnoreCase(s)) {

				ele.click();

				break;

			}

		}

		List<WebElement> checkele = driver.findElements(By.xpath("//input[@name='webform' and @type='checkbox']"));

		int b = checkele.size();

		System.out.println(">>>>" + b);
		for (int i = 0; i < b; i++) {

			WebElement ele1 = checkele.get(i);

			Thread.sleep(5000);
			String s1 = ele1.getAttribute("value");

			System.out.println(">>>>>>" + s1);
		}
	}

}
