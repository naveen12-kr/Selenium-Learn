package dss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Test11 {
	
	
	 static WebDriver driver;
	
	public static void main(String[] args) {
		
		String parent= driver.getWindowHandle();
		
		Set<String> st=  driver.getWindowHandles();
		
		Iterator<String> itr=st.iterator();
		
		while (itr.hasNext()) {
			String child =  itr.next();
			
		}
		
		
		for (String curr : st) {
			
			driver.switchTo().window(curr);
			
		}
		
		
		driver.switchTo().window(parent);
		
			
		
		
		

	}

	
	
}
