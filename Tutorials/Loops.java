package demo;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
		
		//int i=1;		
//		while(i<1) {
//			System.out.println(i);
//			i++;
//		}
		
		
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=5);
		
		
//		for(int i=1;i<=5;i++) {
//			if(i==3) {			
//			continue;			
//			}
//			else
//			{
//				System.out.println(i);
//			}
//		}
		
		for(int i=0;i<20;i++) {
			if(i%2==0) {
				System.out.println(i+" Even");
			}
			else {
				System.out.println(i+" Odd");
			}
		}
		
		Methods md=new Methods();
		md.greet("Neha");		
		md.add1(2, 3);
	}

}
