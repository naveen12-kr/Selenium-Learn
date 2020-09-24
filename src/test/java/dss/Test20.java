package dss;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test20 {

	static WebDriver driver;

	static WebElement ele;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://qa-aws-2.intradyn.com/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("ChangeMe");

		driver.findElement(By.xpath("//input[@id='submit']")).click();

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		tableSearch();
		
	}

	public static void tableSearch() {

		driver.findElement(By.xpath("//span[contains(text(),'Configuration')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Tags')]")).click();

		WebElement table = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div[2]/div/table/tbody"));

		List<WebElement> row = table.findElements(By.tagName("tr"));

		int a = row.size();

		System.out.println(">>>>" + a);
		
		for (WebElement ele : row) {
			
			System.out.println("The list contain: " +ele.getText());
			
		}
		
		Iterator<WebElement> itr=row.iterator();	
			
		while (itr.hasNext()) {
			//WebElement ele1 =  itr.next();
			
			System.out.println(">>>>>>>>>>" +itr.hasNext());
			
			System.out.println(">???" + itr.next().getText());
		}
			
		
		
		

	    }

}
