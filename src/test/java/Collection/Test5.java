package Collection;

import java.util.LinkedHashSet;

public class Test5 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> h =new LinkedHashSet<String>();
		
		h.add("Programmer");
		h.add("Developer");
		h.add("Tester");
		h.add("Trainer");
		
		for (String str : h) {
			
			if (h.contains("Programmer")) {
				
				System.out.println("The statement is true");
				
			} else {
				
				System.out.println("The statement is false");

			}
			
		}
		

	}

}
