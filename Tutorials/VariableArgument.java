package Tutorials;

public class VariableArgument {
	
	public VariableArgument() {		//Default constructor
		System.out.println("Hello");
	}
	
	public static int sumNumber(int ... args){
        //System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;				//sum=sum+x;		
            
            //System.out.println(sum);
        }
        return sum;
    }
	
//	static int add(int a,int b) {
//		int c;
//		c=a+b;
//		return c;
//	}
//	
//	static int add(int a,int b,int d) {
//		int c;
//		c=a+b+d;
//		return c;
//	}

    public static void main( String[] args ) {
    	VariableArgument ex = new VariableArgument();
//    	int d=sumNumber(3,4,5,6);
//    	System.out.println(d);
       //ex.sumNumber(2, 4);
       //System.out.println("sum2 = " + sum2);
    	
//       int sum3 = ex.sumNumber(1, 3, 5);
//       System.out.println("sum3 = " + sum3);
//
//        int sum4 = ex.sumNumber(1, 3, 5, 7);
//        System.out.println("sum4 = " + sum4);
    }

}


