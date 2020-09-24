package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("//a[@class='black']")).click();

		Set<String> str = driver.getWindowHandles();

		System.out.println("The size of window:" + str.size());

		Iterator<String> itr = str.iterator();

		String ParentWindowId = itr.next();

		System.out.println("parent window id:" + ParentWindowId);

		String childWindowId = itr.next();

		System.out.println("child window id:" + childWindowId);

		driver.switchTo().window(childWindowId);

		System.out.println("The title of child window:" + driver.getTitle());

		Thread.sleep(5000);

		driver.close();

		driver.switchTo().window(ParentWindowId);

		System.out.println("The title of parent window:" + driver.getTitle());

	}

}
