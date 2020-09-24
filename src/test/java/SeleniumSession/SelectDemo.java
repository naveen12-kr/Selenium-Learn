package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement ele= driver.findElement(By.name("country"));
		
		Select sel = new Select(ele);
		
		String ss=ele.getText();
		
		System.out.println(">>>>>" + ss);
		
		
		
		

	}

}
