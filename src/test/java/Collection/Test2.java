package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		List<String>al=new ArrayList();
		
		al.add("10");
		al.add("50");
		al.add("30");
		al.add("40");
		System.out.println(al);
		ArrayList als=new ArrayList(al);
		 als.add(200);
		 als.add(500);
		 als.add(700);
		 
		 System.out.println(als);
		 
		// al.add(2, 300);
		 
		 System.out.println(al);
		 
		 ArrayList<String> all=new ArrayList();
		 all.add("999");
		 all.add("888");
		 all.add("777");
		 
		 
		// all.addAll(als);
		 
		 System.out.println(all);
		 
		 Set ss=new HashSet(); 
			 
			 ss.add(87800);
			 ss.add(7800);
			 ss.add(800);
			 ss.add(900000);
			 ss.add(1);
			 
			 
			 System.out.println(ss);
			 
			 ArrayList<List<String>> li= new ArrayList<List<String>>();
			 
			 li.add(al);
			 li.add(all); 
			 System.out.println("The list of:" +li.get(1).get(1));
		

	}
	
	
	
}
