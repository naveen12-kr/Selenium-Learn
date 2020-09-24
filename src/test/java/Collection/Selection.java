package Collection;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selection {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.silentOutput", "true");

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.manage().window().maximize();

		Thread.sleep(3000);

//		List<WebElement> li= driver.findElements(By.xpath("//table[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li"));
//		
//		int row_count= li.size();
//		
//		
//		
//		System.out.println(">>>" + row_count);
//		
//		for (int i = 1; i < row_count; i++) {
//			
//			String ss=li.get(i).getText();
//			
//			System.out.println("The text are" + ss);
//			
//		}

//		String beforexpath= "//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[" ;
//		
//		String afterxpath= "]/a";

		// String actualxpath= beforexpath +i+afterxpath;

//		List<WebElement> ltr = driver.findElements(By.xpath(" //*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li"));
//		
//		int a=ltr.size();
//		
//		System.out.println("The list size is :"  + a);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\\\"navbar-brand-centered\\\"]/ul/li[1]/ul/li"));
		
		Select sel=new Select(ele);
		
		System.out.println("???//////" + sel.getOptions());
		
//		for (int i = 2; i < a; i++) {
//			
//			Thread.sleep(5000);
//			
//			String ss=(ltr.get(i).getText());
//			Thread.sleep(5000);
//			
//			System.out.println(">>>" +ss);
//			
//			
//	        }
		
	

	}
}