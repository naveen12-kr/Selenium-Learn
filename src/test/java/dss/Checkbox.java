package dss;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

//		WebDriverManager.chromedriver().setup();

//		driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		
		driver= new FirefoxDriver();

		driver.get("https://jqueryui.com/datepicker");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		// selectCheckBox();

		// Checkbox.form("abhi", "abhi@gmail.com", "9898987656");

		// menuBar();

		// driver.close();
		// alertMsg();
		dateCalendar();

	}

	public static void selectCheckBox() throws Throwable {

		for (int i = 1; i <= 3; i++) {

			String actual = "//input[@id='vfb-7-" + i + "']";

			WebElement ele = driver.findElement(By.xpath(actual));

			ele.click();

			Thread.sleep(5000);

		}

	}

	public static void form(String name, String email_id, String mobile_num) throws Throwable {

		driver.findElement(By.xpath("//input[@id='ft_name']")).sendKeys(name);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ft_email']")).sendKeys(email_id);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ft_mobile']")).sendKeys(mobile_num);
		Thread.sleep(5000);

		String str = "Get Your Free Research Report";
		WebElement ele1 = driver.findElement(By.xpath("//h3[contains(text(),'Get Your Free Research Report')]"));
		if (str.equalsIgnoreCase(ele1.getText())) {

			System.out.println("The statement is true:" + ele1.getText());

		} else {

			System.out.println("The statement is false");

		}

		// driver.findElement(By.xpath("//button[@id='ftrial']")).click();

	}

	public static void menuBar() throws Throwable {

		String before = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[";
		String after = "]/a[1]";

		for (int i = 1; i <= 5; i++) {

			String actual = before + i + after;

			WebElement ele = driver.findElement(By.xpath(actual));

			System.out.println(">>>>" + ele.getText());

			ele.click();

			Thread.sleep(3000);
		}

	}

	public static void alertMsg() {

		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1111");

		driver.findElement(By.xpath("//input[@name='submit']")).submit();

		Alert alert = driver.switchTo().alert();

		System.out.println("The alert msg:" + alert.getText());

		// alert.accept();

		// alert.dismiss();

	}

	public static void dateCalendar() throws Throwable {

		driver.switchTo().frame(0);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.id("datepicker")).click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));

		List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));

		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns) {

			// Select 10th Date

			if (cell.getText().equals("10")) {

				cell.findElement(By.linkText("10")).click();

				break;

			}

		}

	}

}
