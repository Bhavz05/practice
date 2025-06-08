package practice;

public class StriP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world";
		String n=new String("Welcome to India");
		System.out.println(s);
		System.out.println(n);
		System.out.println(s.concat(n));
		System.out.println(s.length());
		System.out.println(s.contains(n));
		System.out.println(s.equals(n));
		System.out.println(s.equalsIgnoreCase(n));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		int a=10;
		System.out.println(String.valueOf(a));
		StringBuffer s1=new StringBuffer("Welcome to OOty");
		StringBuilder s2= new StringBuilder("java Programming");
		System.out.println(s1);
		System.out.println(s2);
		s1.replace(1,4, "s");
		System.out.println(s1);
		s2.insert(0, "k");
		System.out.println(s2);

	}

}
