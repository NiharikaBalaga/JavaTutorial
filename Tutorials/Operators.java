package demo;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmetic operators
		
		int a=6;
		int b=3;		
		int c;
//		
//		c=a+b;
//		c=a-b;
//		c=a/b;
//		c=a*b;
//		c=a%b;		//Modulo operator
		c=b++;
		
//		System.out.println(b);
		
		//Assignment Operators
		
//		int x=10;
		int y=9;
////	    y=y+3;		
	    y+=2;		// same as y=y+1
//	    System.out.println(y);
		
		
		//Comparision operators		
//		int s=67;
//		int d=67;
//		System.out.println(s<=d);
//		System.out.println(s==d);      //equal to
//		System.out.println(s!=0);      //not equal to
		
		
		//Logical Operators
		
//		int m1=35;
//		int m2=45;
//		System.out.println(m1>40 && m2>35);			//AND 
//		System.out.println(m1>40 || m2>35);			//OR
//		System.out.println(!(m1==m2));				//NOT
		
		
		//Bitwise Operators
		
		int r=4;
		int v=3;
		
		// 		1	0	0
		//		0	1	1
		//-----------------
		//		0	0	0
		//-----------------
		System.out.println(r&v);
		System.out.println(r|v);
		
		
	}

}
