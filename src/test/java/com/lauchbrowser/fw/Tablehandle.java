package com.lauchbrowser.fw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tablehandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table= driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody"));
		
		List<WebElement> row_table = table.findElements(By.tagName("tr"));

		int row_count = row_table.size();

		System.out.println("The size of row is :" + row_count);
		
		for (int i = 0; i < row_count; i++) {
			
			List<WebElement> col_table = row_table.get(i).findElements(By.tagName("td"));
			
			int col_count=col_table.size();
			
			System.out.println("The size of col is" + col_count);
			
			for (int j = 0; j < col_count; j++) {
				
				
				String cell_text = col_table.get(j).getText();

				System.out
						.println("Cell Value Of row number " + i + " and column number " + j + " Is " + cell_text);

				
			}
			
		}
		
		
	

	}

	
	
}
