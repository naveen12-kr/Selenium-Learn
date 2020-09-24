package Collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

import com.helger.commons.system.ENewLineMode;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h1 = new Hashtable();
		
		h1.put(1, "Tom");
		h1.put(2, "Selenium");
		h1.put(3, "Java");
		
		Hashtable h2 = new Hashtable();
		
		h2=(Hashtable) h1.clone();
		
		
		System.out.println("value of h1" + h1);
		System.out.println("value of h2" + h2);
		
		h1.clear();
		
		System.out.println(" After clear value of h1" + h1);
		System.out.println(" After clear  value of h2" + h2);
		
		//contain values
		
		Hashtable st = new Hashtable();
		
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if (st.containsValue("Naveen")) {
			
			System.out.println("value is found");
			
		}
		
		System.out.println(">" + st.get("A"));
		
		//print all values
		
		Enumeration e=st.elements();
		
		System.out.println("print value of enumeration st");
		
		while (e.hasMoreElements()) {
			//System.out.println(e.nextElement());
			String ss=(String) e.nextElement();
			
			System.out.println(">>>>>>>" + ss);
				
			
		}
		
		System.out.println("print value of enumeration st");
		
		Set s=st.entrySet();
		
		System.out.println("The set contains" + s);
			
		}
		

	}


