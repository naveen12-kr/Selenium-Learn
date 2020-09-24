package dss;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice4 {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.silentOutput", "true");

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.manage().window().maximize();
		
		

		WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));

		Select sel = new Select(ele);

		List<WebElement> dropdown_list = sel.getOptions();

		for (int i = 0; i < dropdown_list.size(); i++) {

			String dropdown_value = dropdown_list.get(i).getText();

			System.out.println("dropdown values are:-> " + dropdown_value);

		}
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		System.out.println("the Screenshot is taken");
		driver.quit();

	}

}
