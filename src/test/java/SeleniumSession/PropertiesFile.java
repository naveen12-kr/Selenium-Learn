package SeleniumSession;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class PropertiesFile {

	static WebDriver driver;

	static Properties prop = new Properties();
	static String path = System.getProperty("user.dir") ;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("incognito");

		driver = new ChromeDriver(options);

		getProperty();
		
		setProperties();
		
		getProperty(); 

		driver.get(prop.getProperty("url"));

	}

	public static void getProperty() {

		try {

			InputStream input = new FileInputStream(path +  "/ConfigData/config.properties");

			prop.load(input);

			prop.getProperty("url");

			// driver.get(prop.getProperty("url"));

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}

	public static void setProperties() {

		try {

			OutputStream output = new FileOutputStream(path + "/ConfigData/config.properties");
			
			prop.setProperty("url", "https://ui.freecrm.com/calendar");
			
			prop.store(output, null);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}

}
