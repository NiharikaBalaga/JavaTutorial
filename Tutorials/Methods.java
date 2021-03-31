package Tutorials;

import java.util.Scanner;

public class Methods {
	
	static int add(int q,int p)
	{
		int c=q+p;
		String n="Neha";
		System.out.println(c);
		return c;
	}
	
	static void add1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void add3(
			)
	{
		int n=98;
		System.out.println(n);
	
	}
	
	void doll(int a,int b,int c) {
		int g=a*b*c;
		System.out.println(g);
	}
	
	int printname()
	{
		int a=6;
		System.out.println("Hello");
		return a;
	}
	    static int logic(int x, int y){
	        int z;
	        if(x>y){
	            z = x+y;
	        }
	        else {
	            z = (x +y) * 5;
	        }
	        //x = 566;
	        return z;
	    }

int multiply(int a,int b,int c) {
	int d=a*b*c;
	return d;
}
 void multiply1() {
	int a=10;
	int b=10;
	int c=a*b;
	System.out.println(c);
}

static void greet(String name) {
	System.out.println("Good Morning "+ name);
}

 void  greet1(String n) {
	System.out.println("Good Morning " +n);
}
	
	    public static void main(String[] args) {
	    	Methods m=new Methods();
	    	//Scanner sc= new Scanner(System.in);
	    	
	    	m.add3();
	    	m.doll(2,7,8);
//	    	doll(2,3,4);
//	    	greet1();
	    	greet("Suvi");
	    	int r=logic(8,5);	    	
	    	System.out.println(r);
	    	//System.out.println(doll(3,2,4)-10);
	    	
//	    	int x=multiply(2,4,6);
//	    	multiply1();
//	    	System.out.println(x-2);
//	    	greet("Neha");
	    	//greet1();
	    	//m.greet1();
	    	//m.greet("Chitra");
	    	m.multiply1();
	    	int g=m.multiply(9,2,1);
	    	System.out.println(g);
	    	
//	        int a = 5;
//	        int b = 7;
//	        int sum;
//	        sum=a+b;
       
//	    	int sum;	        
//	        add(12,10);
//	        add3();
//	        //System.out.println(add(8,9));
//	        //System.out.println(sum);
//	        printname();
	        
	        // Method invocation using Object creation
	        //cwh_31_methods obj = new cwh_31_methods();
	        //c = obj.logic(a, b);
//	        c = logic(a, b);
//	        System.out.println(a + " "+ b);
//	        int a1 = 2;
//	        int b1 = 1;
//	        int c1;
//	        c1 = logic(a1, b1);
//	        System.out.println(c);
//	        System.out.println(c1);
	    }
	}


