package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList();
		
		al.add("ddd");
		al.add("naveen");
		al.add("na");
		
		System.out.println("The size of:" + al.size());
		
		for (int i = 0; i < al.size(); i++) {
			
			System.out.println(">?>>?>?" + al.get(i));
			
		}
		
		Iterator<String> itr=al.iterator();
		
		while (itr.hasNext()) {
			String string =  itr.next();
			
			System.out.println(">>>>" + string );
			
			if (string.equalsIgnoreCase("naveen")) {
				
				System.out.println("True");
				
			} else {
				
				System.out.println("False");

			}
			
		}
		
		for (String str : al) {
			
			System.out.println("???>><<???" +str);
			
		}
		
		 System.out.println(">>>" + al.size());
		 
		 System.out.println(">>>??" + al.get(1));
		 if (al.get(1).equalsIgnoreCase("naveen")) {
				
				System.out.println("True");
				
			} else {
				
				System.out.println("False");

			}
			
		 
		for (int i = 0; i < al.size(); i++) {
			
	      
			
		}

	}

}
