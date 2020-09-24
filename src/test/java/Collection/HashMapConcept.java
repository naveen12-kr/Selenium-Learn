package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "Java");
		hm.put(3, "dataBase");
		
//		System.out.println(hm.get(1));
//		
//		for (Entry m:hm.entrySet()) {
//			
//			System.out.println(m.getKey() +" " + m.getValue());
//			
//		}
		
		Set<Integer> s1=hm.keySet();
		
		System.out.println(">>>" + s1);
		
		Collection<String> c=hm.values();
		
		System.out.println(">?>?" + c);
		
		Set<Entry<Integer,String>> s2=hm.entrySet();
		
		System.out.println("The text print>:" + s2);
		
      
		
	}

}
 