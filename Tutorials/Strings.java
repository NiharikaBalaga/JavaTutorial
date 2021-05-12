package demo;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String name;				//Immutable
		
		name="Yamini";
		String name1="yamini";
		String n=name.toUpperCase();
		System.out.println(n);
		System.out.println(name+" is good");		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(4));
		System.out.println(name.concat(" is Good"));
		System.out.println(name.startsWith("Y"));
		System.out.println(name.endsWith("e"));
		System.out.println(name.replace('-',' ' ));
		System.out.println(name.trim());
		System.out.println(name.substring(2,6));
		System.out.println(name.indexOf('n'));
		System.out.println(name.indexOf('i'));
		System.out.println(name.indexOf('m', 2));
	System.out.println(name.equals(name1));
	System.out.println(name.equalsIgnoreCase(name1));

		
		//split,equals,contains, equalignorecase
		
	}

}
