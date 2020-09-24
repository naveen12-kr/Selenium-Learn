package Collection;

public class ClickMethod {

	int id;

	String name;

	public ClickMethod(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		ClickMethod cl = new ClickMethod(11, "nav");

		System.out.println(cl.id + "  " + cl.name);

		String s1 = "Vivekanand";

		System.out.println(s1.charAt(2));
		
		String s4="hi sir how r u";
		
	String[] a=s4.split("   ");
	
	for (String string : a) {
		
		System.out.println(string);
		
		
		
	}
		

	}

}
