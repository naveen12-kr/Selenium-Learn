package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test6 {

	public static void main(String[] args) {
		
		TreeSet<Integer> tr=new TreeSet<Integer>();
		
		tr.add(3333);
		tr.add(444);
		
		for (Integer itr : tr) {
			
			System.out.println(">>>>" + tr);
			
		}
		
		Iterator<Integer> itrr=tr.iterator();
		while (itrr.hasNext()) {
			Integer int1 =  itrr.next();
			
			System.out.println("???????"  + int1);
			
		}
		
		//tr.add(99999);
		
		//System.out.println("The size:" +  tr.size());
//		
//		for (int i = 0; i < tr.size(); i++) {
//			
//			System.out.println(tr);
//			
//			
//			
//		}
//		
////		System.out.println(">>>"  + tr);
//		
//		for (Integer in : tr) {
//			
//			System.out.println(">>>>>>>>>" + in);
//			
//		}
//		
		 
//		Set tre=new TreeSet();
//		
//		tre.add(10);
//		tre.add("jjjj");
//		
//		System.out.println(">>>>" +tre);
//		
		List l=new ArrayList();
		
		l.add(23);
		l.add("kkk");
		
		
		System.out.println("the list:" + l);
		
		
	}

}
