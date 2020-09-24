package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String month = "Sep 2020";

		String day = "25";

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.zkoss.org/zkdemo/input/date_and_time_picker");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//body[@class='webkit chrome iceblue_c']//tr//tr[1]//td[2]//div[1]//span[1]//a[1]")).click();

		Thread.sleep(5000);

		while (true) {

			String ss = driver.findElement(By.xpath("//*[@id=\"_z_0-tm\"]")).getText();

			System.out.println(">>>>>>" + ss);

			if (ss.equalsIgnoreCase(month)) {

				break;

			} else {
				
				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[@id=\"_z_0-right\"]/i")).click();

			}

		}
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[contains(text(),"+day+")]")).click();;

	}

}
