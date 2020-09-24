package Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		Thread.sleep(5000);
		
		WebElement date=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		
		
		Thread.sleep(3000);
		
		String date1="27/02" ;
		
		selectDateByJS(driver, date, date1);

	}
	
	public static void selectDateByJS(WebDriver driver,WebElement ele, String datevalue) {
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].setAttribute('value','" +datevalue+" ');", ele);
		
		//js.executeScript("document.getElementById("textbox_id").value='new value';", args)
		
		
		
		
		
		
		
	}

}
