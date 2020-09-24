package dss;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class String1 {
	
	static WebDriver driver;

	public static void main(String[] args) {

		String s1 = "Programme";
		String s2 = "Programme";
		String s3 = new String("Programme");

		String str = new String(s1);

		System.out.println(str.charAt(3));

		boolean s = s1.equals(s2);

		System.out.println(s);

		boolean ss = s2 == s3;

		System.out.println(ss);
		
		String s6="Hello_in_java_world";
		
		String ss1 []=s6.split("_");
		
		System.out.println(">>>" +ss1);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("scrollBy(0,3000)");
		

	}

}
