package Collection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RePcExample {
	
	static WebDriver ffDriver;

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		ffDriver=new ChromeDriver();
		
	
		openSameUrlInMultipleWindow();
		
		
		
	}
		
	
		
		
		
	

		 

	

	
	 public static  void openSameUrlInMultipleWindow() throws InterruptedException {
		  
		  String pageUrl = "http://www.bing.com";
		   ffDriver.get(pageUrl);
		  
		  /* Cast webdriver object to Javascript Executor object. */
		  JavascriptExecutor jsExecutor = (JavascriptExecutor)ffDriver;
		  
		  /* Javascript that will create new FirefoxWindow. */
		  String jsOpenNewWindow = "window.open('"+pageUrl+"');";
		  /* Run above javascript. */
		  for(int i=0;i<6;i++)
		  {
			  jsExecutor.executeScript(jsOpenNewWindow);
			  Thread.sleep(1000);
			  System.out.println("One opennd.");
		  }
}
}