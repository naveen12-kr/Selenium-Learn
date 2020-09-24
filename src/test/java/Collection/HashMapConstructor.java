package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConstructor {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Emp,Student> h1=new LinkedHashMap<Emp, Student>();
		
		h1.put(new Emp("nav", 22, "IT"),new Student(10, "jitu"));
		h1.put(new Emp("stish", 32, "Marketing"),new Student(12, "srini"));
		
		Set<Emp> e1=h1.keySet();
		
		for (Emp emp : e1) {
			
			System.out.println("The text of Emp:" +emp.name+"  "+emp.age+ "  "+emp.department);
			
		}
		
		Collection<Student> s1=h1.values();
		
		for (Student stu : s1) {
			
			System.out.println("The text of Student:" +stu.sid+"  "+ stu.sname);
			
		}
		
		Set<Entry<Emp,Student>> a1=h1.entrySet();
		
		for (Entry<Emp, Student> entry : a1) {
			
			System.out.println(">>>" +entry.getKey().name +" "+entry.getKey().age+"  "+entry.getKey().department);
			
		}
		
		Set<Entry<Emp,Student>> ss=h1.entrySet();
		
		Iterator<Entry<Emp,Student>> itr=ss.iterator();
		
		while (itr.hasNext()) {
			
			Entry<Emp,Student> ent=itr.next();
			
			Emp e2=ent.getKey();
			
			System.out.println(">???" +e2.name+"  " +e2.name+"  " +e2.department);
			
			Student st=ent.getValue();
			
			
		}
		
	}

}
