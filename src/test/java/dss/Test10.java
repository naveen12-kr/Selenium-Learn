package dss;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {

	public static WebDriver driver;

	public static WebElement ele;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		DesiredCapabilities chro_cap = DesiredCapabilities.chrome();

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("incognito");

		chro_cap.setCapability(ChromeOptions.CAPABILITY, opt);

		driver = new ChromeDriver(opt);

		String ss = "http://demo.guru99.com/test/ajax.html";

		driver.get(ss);
//
//		String expected = "One Way";
//
//		ele = driver.findElement(By.xpath("//label[@class='select-label'][contains(text(),'One Way')]"));
//
//		String actual = ele.getText();
//
//		System.out.println(">>>>>" + actual);
//
//		if (expected.equalsIgnoreCase(actual)) {
//
//			System.out.println("This is true");
//
//		} else {
//
//			System.out.println("This is false");
//
//		}

//		ele= driver.findElement(By.xpath("//input[@name='q']"));
//		
//		ele.sendKeys("wiki");
//		
//		System.out.println("The text enter: " + ele.getAttribute("value"));
//		
		List<WebElement> ele = driver.findElements(By.name("name"));

		System.out.println("The size of list::" + ele.size());

//		for (int i = 0; i < ele.size(); i++) {
//			
//			System.out.println(">>>>" + ele.get(i).getAttribute("value"));
//			
//			ele.get(i).click();
//			
//			break;

//		for (WebElement ele1 : ele) {
//			
//			
//			
//			System.out.println(">??" + ele1.getAttribute("value"));
//			
//			Thread.sleep(3000);
//			
//			ele1.click();

		Iterator<WebElement> itr = ele.iterator();

		while (itr.hasNext()) {
			WebElement ele2 = itr.next();

			System.out.println("The list value is:: >>>" + ele2.getAttribute("value"));

			Thread.sleep(5000);

			ele2.click();

		}

	}

}
