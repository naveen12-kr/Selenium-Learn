package Constructor;

public class Test1 {

	void m1() {

		System.out.println("m1 method");

	}

	Test1(int a) {

		System.out.println("1-arg const");
	}

	Test1(int a, int b, int c) {

		System.out.println(a + b + c);

	}

	public static void main(String[] args) {

		Test1 t = new Test1(22);
		Test1 t1 = new Test1(10);
		Test1 t2 = new Test1(34, 89, 90);
		t1.m1();

		int[] a = { 2, 34, 4, 6, 7 };

//   for (int i : a) {
//	   
//	   System.out.println(i);

		for (int j = 0; j < a.length; j++) {

			System.out.println("The output is:" + a[j]);
		}
		System.out.println("The output is particular:" + a[2]);

	}

}
