package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFile {

	 static WebDriver driver;

	static Properties prop = new Properties();

	static String path = System.getProperty("user.dir");

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		getProperties();
//		// setProperties();
		userLogin();
		//MenuIcon();
		//subMenuIcon();
	   // checkOut();
//		// driver.close();
	    
	    
//
	}
//
 public static void getProperties() {
		try {

			InputStream input = new FileInputStream(path + "/config.properties");
			prop.load(input);
			//String browser = prop.getProperty("url");
			System.out.println(prop.getProperty("url"));

			//driver.get(browser);
			
			driver.get(prop.getProperty("url"));

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

////	public static void setProperties() {
////		
////  try {
////			
////			OutputStream output=new FileOutputStream(path + "/config.properties");
////			prop.setProperty("url", "https://mvnrepository.com/");
////			prop.store(output, null);
////		    driver.get(prop.getProperty("url"));
////
////		} catch (Exception e) {
////
////			System.out.println(e.getMessage());
////			System.out.println(e.getCause());
////			e.printStackTrace();
////		}
////		
//
	public static void userLogin() {

//		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("naveenwell@gmail.com");
//		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("wait@1123");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		System.out.println(">>>");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(">>>>>>.");
		driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();;
		System.out.println(">>>.");

	}

	public static void MenuIcon() {

		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));

		boolean status = ele.isDisplayed();

		if (status) {

			ele.click();

		} else {

			System.out.println("The element not found");

		}
	}

	public static void subMenuIcon() {
		// li[@class='Wbt_B2 _3mmoXN']//li[@class='_1GPxMV
		// _3mmoXN']//li[1]//ul[1]//li[2]//a[1]

		String Beforexpath = "//li[@class='Wbt_B2_3mmoXN']//li[@class='_1GPxMV_3mmoXN']//li[1]//[1]//li[";

		String Afterxpath = "=]//a[1]";

		for (int i = 2; i <= 17; i++) {

			String actualpath = "//li[@class='Wbt_B2 _3mmoXN']//li[@class='_1GPxMV _3mmoXN']//li[1]//ul[1]//li[" + i
					+ "]//a[1]";
			WebElement ele1 = driver.findElement(By.xpath(actualpath));
			
			System.out.println(ele1.getText());
			
//			if (ele1.getText().equals("Mi")) {
				ele1.click();
			System.out.println(driver.getCurrentUrl());
			System.out.println("The mobile name is:" + ele1.getText());

				// break;

//			}
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			ele.click();
		}
		
	}

	public static void checkOut() {
		
		
//    boolean selected = driver.findElement(By.xpath("//div[contains(text(),'Redmi 8 (Onyx Black, 64 GB)')]"))
//				.isSelected();
//		System.out.println("The content is:" + selected);

		driver.findElement(By.xpath("//div[contains(@class,'_1HmYoV _35HD7C')]//div[2]//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]//div[1]//img[1]")).click();
//		driver.findElement(By.xpath("//div[contains(@class,'_1HmYoV _35HD7C')]//div[2]//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]//div[1]//img[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		for (String curr : allWindows) {

			driver.switchTo().window(curr);

		}


//		Set<String> s1 = driver.getWindowHandles();

//		Iterator<String> I1 = s1.iterator();
//		while (I1.hasNext()) {
//			String child = (String) I1.next();

//			if (!parent.equals(child)) {

//				driver.switchTo().window(child);

//				System.out.println(driver.switchTo().window(child).getTitle());

		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();

		System.out.println(driver.getCurrentUrl());

		// driver.close();
		// }

	   driver.switchTo().window(parent);

	}

}
