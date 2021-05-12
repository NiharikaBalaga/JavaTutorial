package demo;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=90;
		if(m>=90 && m<100)
		{
			System.out.println('A');
		}
		else if(m>80 && m<90)
		{
			System.out.println('B');
		}
		else if(m>70){
			System.out.println('C');
		}
		
		
		int number=44;  
	    //Switch expression  
	    switch(number){  
	    //Case statements  
	    case 44: 
	    		System.out.println("44");  
	    		break;
	    case 20: 
	    		System.out.println("hgdfiu20");  
	    		 break; 
	    case 30: 
	    	System.out.println("tjhdkjfbkjg30");  
	    	break;  
	    
	    case 78:
	    	System.out.println("78");
	    	break;
	      
	    default:
	    	System.out.println("Not in 10, 20 or 30");  
	    }  
	}

}
