package dss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("file:///C:/Users/ss/Desktop/example.html");

		Thread.sleep(5000);

		// driver.findElement(By.xpath("/html/body/input[5]")).click();

		List<WebElement> list = driver.findElements(By.xpath("/html/body/input"));

		int a = list.size();

		System.out.println("The count of element \n INFO :" + " " + a);

//		for (int i = 1; i < a; i++) {
//
//			String ss = list.get(i).getAttribute("value");
//
//			System.out.println("The list of text is :" + ss);
		
		for (WebElement ee : list) {
			
			System.out.println("The list of text is :\n" + ee.getAttribute("value"));
			
			
			
		}

		}

	}


