package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Demo {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.iedriver().setup();

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("ignoreProtectedModeSettings", true);

		// cap.setAcceptInsecureCerts(true);

		InternetExplorerOptions ops = new InternetExplorerOptions();

		ops.setCapability("enableElementCacheCleanup", true);

		driver = new InternetExplorerDriver(cap);

		driver.get("https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities");

		String browsername = cap.getBrowserName();

		System.out.println("The browser name:" + browsername);

		String browserversion = cap.getVersion();

		String ss = ops.getBrowserName();
		String s1 = ops.getVersion();

		System.out.println(">>>" + ss);

		System.out.println("The browser version:" + s1);

	}

}
