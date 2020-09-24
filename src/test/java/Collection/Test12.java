package Collection;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12 {
	

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://easyupload.io/");

		upLoadFile();

	}

	public static void upLoadFile() throws Throwable {

		Robot robot = new Robot();

		WebElement ele = driver.findElement(By.xpath("//h5[@class='title']"));

		ele.click();

		robot.setAutoDelay(2000);

		StringSelection strs = new StringSelection("C:\\Users\\ss\\Downloads\\Financial Sample.xlsx");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strs, null);

		robot.setAutoDelay(2000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[@id='upload']")).click();

	}

}
