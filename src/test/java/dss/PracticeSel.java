package dss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSel {

	static WebDriver driver;
	
	 static WebElement ele;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.silentOutput", "true");

		driver = new ChromeDriver();

		driver.get("https://www.javatpoint.com/");

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scrollBy(0, 5000)");

		List<WebElement> ltr = driver.findElements(By.xpath("//*[@id=\"link\"]/div/ul/li"));

		int a = ltr.size();

		System.out.println(">>>>>" + a);

		String ss = "JavaScript";

		for (int i = 1; i < a; i++) {

			String s1 = ltr.get(i).getText();

			System.out.println(">>>>" + s1);

			if (ss.equalsIgnoreCase(s1)) {

				System.out.println("The text is correct");

				 ele = driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[5]/a"));

				boolean b = ele.isEnabled();

				System.out.println(">>>>" + b);

				Thread.sleep(8000);

				ele.click();
				
			
				
				ele=driver.findElement(By.xpath(" //*[@id=\"menu\"]/div[1]/h2/span"));
				
				System.out.println(">>>>" + ele.getText());
				
				break;

				
				
				
				
				

			}

		}

	}

}
