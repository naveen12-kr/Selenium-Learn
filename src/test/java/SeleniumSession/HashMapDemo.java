package SeleniumSession;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://ui.freecrm.com/");

		driver.manage().window().maximize();
		String ss = getCredentialMap().get("customer");

//		String[] customer = ss.split(":");
//
//		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(customer[0]);
//
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(customer[1]);
		
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(getUsername("customer"));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(getPass("customer"));

	}

	public static HashMap<String, String> getCredentialMap() {

		HashMap<String, String> userMap = new HashMap<String, String>();

		userMap.put("customer", "naveenwell@gmail.com:Wait@123");

		return userMap;

	}
	
	public  static String getUsername(String role) {
		
		String credential=getCredentialMap().get(role);
		
		return credential.split(":")[0];
		
		
	}

  public static String getPass(String role) {
		
		String credential=getCredentialMap().get(role);
		
		return credential.split(":")[1];
		
		
	}
}
