package SeleniumSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFileUploadPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.manage().window().maximize();
		
	WebElement ele1=driver.findElement(By.xpath("//input[@id='fileupload']"));
     ele1.sendKeys("C:/Users/ss/Desktop/June Electricity bill.PNG");
     
     HandleFileUploadPopUp.drawBorder(ele1);
     
     HandleFileUploadPopUp.screenShots();  
     
	}
	
	public static void drawBorder(WebElement ele) {
		
	JavascriptExecutor js=((JavascriptExecutor) driver);
	
	js.executeScript("arguments[0].style.border='3px solid orange'", ele);
		
	}
	
	public static void screenShots() throws IOException {
		
		TakesScreenshot tsk=((TakesScreenshot) driver);
		File scr=tsk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:/Users/ss/eclipse-workspace/SeleniumLearn/target/Screenshots.png"));

}
}