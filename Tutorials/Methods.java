package demo;

import java.util.Scanner;

public class Methods {

	static float add(float a,int b) {
		float d=a+b;
//		System.out.println(d);
		return d;
	}
	
	static void add1(int a,int b) {
		System.out.println(a+b);
	}
	
	void greet(String name) {
		System.out.println("Good Morning "+name);
	}
	
	void greet1() {
		System.out.println("Good Morning ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Methods obj=new Methods();
//		int x=add(5,10);
//		System.out.println(x);
//		System.out.println(add(2,3));
		float y=add(12,3);
		System.out.println(y-2);
	obj.greet1();
	obj.greet("Neha");
	
		//greet("Mangai");
		//greet1();
		
//		int a=5;
//		int b=10;
//		int c=a+b;
//		
//		int a1=5;
//		int b1=10;
//		int c1=a+b;
		
	}

}
