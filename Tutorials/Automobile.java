package demo;

import java.util.Scanner;

public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		
		if(a>=0 && a<=0.4) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else if(a>0.4) {
			float z=0.3f;
			float y=352;
			a=z;
			b=y;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			
		}

	}

}
