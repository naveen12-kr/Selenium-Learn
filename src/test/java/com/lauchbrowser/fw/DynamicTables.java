package com.lauchbrowser.fw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTables {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		DesiredCapabilities cap_chro = DesiredCapabilities.chrome();

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("incognito");

		cap_chro.setCapability(ChromeOptions.CAPABILITY, opt);

		driver = new ChromeDriver(opt);

		// driver= new ChromeDriver();

		driver.get("https://www.moneycontrol.com/");

		Thread.sleep(5000);
		
		getdata();

	}
	
	public static void getdata() {
		
          WebElement table= driver.findElement(By.xpath("//*[@id=\"tgNifty\"]/table/thead"));
          
          List<WebElement> row_table=driver.findElements(By.tagName("tr"));
          
          int row_count= row_table.size();
          
          System.out.println("The size of row:" +row_count );
          
          for (int i = 0; i < row_count; i++) {
        	  
        	  List<WebElement> col_table=row_table.get(i).findElements(By.tagName("td"));
        	  
        	  int col_count=col_table.size();
        	  
        	  System.out.println("The size of col:" + col_count );
        	  
        	  for (int j = 0; j < col_count; j++) {
        	  
        	  String cell_text = col_table.get(j).getText();

				System.out
						.println("Cell Value Of row number " + i + " and column number " + j + " Is " + cell_text);

			
		}
          }		
		
		
	}

}
