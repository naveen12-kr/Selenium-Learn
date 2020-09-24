	package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.testng.internal.thread.ThreadExecutionException;

import net.bytebuddy.asm.Advice.OffsetMapping.ForEnterValue;

public class Map {

	public static void main(String[] args) throws ThreadExecutionException {

//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//
//		hm.put(1, "Selenium");
//		hm.put(2, "QTP");
//		hm.put(3, "Test Completed");
//
//		System.out.println(hm.get(1));
//		System.out.println(hm.get(4));
//
//		System.out.println(">>" + hm);
//
//		for (Entry<Integer,String> m : hm.entrySet()) {
//
//			// System.out.println(">??" + m);
//
//			System.out.println(m.getKey() + " " + m.getValue());
//
//			hm.remove(3);
//
//			System.out.println(" After >>" + hm);
//
//		}

		HashMap<Integer, Emp> emp = new HashMap<Integer, Emp>();

		Emp e1 = new Emp("Tom", 23, "QA");
		Emp e2 = new Emp("Sumi", 26, "Analyst");
		Emp e3 = new Emp("Andy", 29, "Senior Manager");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		for(Entry<Integer, Emp> m: emp.entrySet()) {
			
			
			int key=m.getKey();
			
			Emp empl=m.getValue();
			
			System.out.println(key + "info");
			
			System.out.println(empl.name +" " + empl.age +" " +empl.department);
		}

	}
}