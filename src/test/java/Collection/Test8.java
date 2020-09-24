package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test8 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();

		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");

		System.out.println("The simple way of printing" + al);

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String str = itr.next();

			System.out.println("The iterator printing:" + str);

		}

		for (String str : al) {

			System.out.println("The for loop printing:" + str);

			if (str.equals(al.get(0))) {

				System.out.println("The statement is true");

				break;

			} else {

				System.out.println("The statement is true");

			}

		}

		for (int i = 0; i < al.size(); i++) {

			System.out.println("The another for loop printing::" + al.get(i));
			
			if (al.get(i).equals("aaa")) {
				
				System.out.println(">>>>>> True" );
				
				break;
				
			} else {
				
				System.out.println(">>>>>> False" );

			}

		}

		Set<String> set = new HashSet<String>();

		set.add("pune");
		set.add("delhi");
		set.add("mumbai");

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {

			String str1 = it.next();

			System.out.println(str1);

		}
		
		

	}

}
