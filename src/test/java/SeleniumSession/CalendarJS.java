package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarJS {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// driver.get("https://www.spicejet.com/");

		driver.get("https://www.spicejet.com/Default.aspx");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@id='highlight-book']")).click();
		
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		
		
		

		WebElement eleDate = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']"));
		// WebElement
		// eleDate=driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[@class='maincontainer']/div[@id='wrapper']/div[@id='mainContents']/div[@id='new-homepage']/div[@id='home_banner']/div[@class='home_flight_search']/div[@id='content-change']/div[@class='book']/div[@id='flightSearchContainer']/div[@class='picker-first2']/button[1]"));

		System.out.println(eleDate.getText());

		String datevalue = "24/08";

		CalendarJS.selectDateJS(driver, eleDate, datevalue);

	}

	public static void selectDateJS(WebDriver driver, WebElement ele, String date) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].setAttribute('value','" + date + "');", ele);

	}

}
