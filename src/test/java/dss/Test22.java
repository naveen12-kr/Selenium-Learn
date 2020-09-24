package dss;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test22 {

	static WebDriver driver;

	static WebElement ele;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt= new ChromeOptions();
		
		opt.addArguments("incognito");
		
		//opt.addArguments("headless");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(ChromeOptions.CAPABILITY, opt);
		
		

		//driver = new ChromeDriver();
		
		driver= new ChromeDriver(opt);
		
		driver.get("https://phptravels.com/demo/");

		driver.manage().window().maximize();
		
		opt.addArguments("disable-popup-blocking");

		Thread.sleep(5000);

		// menuHeader();

		searchHeader();

	}

	public static void menuHeader() throws InterruptedException {

		ele = driver.findElement(By.xpath("//span[contains(text(),'Features')]"));

		// ele.click();

		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(5000);

		System.out.println("INFO: The header name is " + ele.getText());

		List<WebElement> ltr = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/ul/li"));

		int a = ltr.size();

		System.out.println(">>>>" + a);

		String s2 = "Flights Module";

		Iterator<WebElement> it = ltr.iterator();

		while (it.hasNext()) {
			WebElement b = it.next();

			String ss = b.getText();

			System.out.println(">>>" + ss);

		}

	}

	public static void searchHeader() throws Throwable {

		List<WebElement> menu = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li"));

		int a = menu.size();

		System.out.println(">>>>>" + a);

		for (WebElement ele : menu) {

			String ss = ele.getText();

			System.out.println(">>>>" + ss);

			String s1 = "LOGIN";

			if (ss.equalsIgnoreCase(s1)) {

				Thread.sleep(3000);

				ele.click();

				String mainWindow = driver.getWindowHandle();

				Set<String> set = driver.getWindowHandles();

				Iterator<String> itr = set.iterator();
				while (itr.hasNext()) {
					String childWindow = itr.next();
					// Compare whether the main windows is not equal to child window. If not equal,
					// we will close.
					if (!mainWindow.equals(childWindow)) {
						driver.switchTo().window(childWindow);
						System.out.println("The child window is: " + driver.switchTo().window(childWindow).getTitle());
						// driver.close();
						Thread.sleep(5000);
						driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("user@phptravels.com");
						Thread.sleep(5000);
						driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("demouser");
					}
				}

				Thread.sleep(8000);
				// This is to switch to the main window
				driver.switchTo().window(mainWindow);
			}
		}

	}

}
