package Collection;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotHandles {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable  {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		takeScreenshot("google_login");
		

	}
	
	public static void takeScreenshot(String filename) throws Throwable  {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("./Screenshots/" +filename+ ".png"));
		
		
		
	}

}
