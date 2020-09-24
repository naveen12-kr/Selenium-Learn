package dss;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws Throwable {
		
		File myObj= new File("D:FileHandlingNewFilef1.txt");
		
		if (myObj.createNewFile()) {
			
			System.out.println("the name:" + myObj.getName());
			
		} else {
			
			System.out.println("File already exists.");

		}

		
		File myObj1=new File("D:FileHandlingNewFilef1.txt");
		
		if (myObj1.exists()) {
			
			System.out.println(">>>" + myObj1.getName());
			
			System.out.println(">>>>>" + myObj1.getAbsolutePath());
			
			System.out.println(">>>>>" + myObj1.canWrite());
			
			System.out.println(">>>>>" + myObj1.canRead());
			
			System.out.println(">>>>>" + myObj1.length());
			
		} else {
			
			System.out.println("The file does not exist");

		}
		
		
	}

}
