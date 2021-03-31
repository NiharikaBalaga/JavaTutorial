package Tutorials;

public class MultidimensionArray {
	
	    public static void main(String[] args) {
	        //int [] marks; // A 1-D Array
	        int [][] flats; // A 2-D Array
	        flats = new int [3][4];		//m*n m=rows,n=col
	        flats[0][0] = 101;
	        flats[0][1] = 102;
	        flats[0][2] = 103;
	        flats[0][3]= 104;
	        flats[1][0] = 201;
	        flats[1][1] = 202;
	        flats[1][2] = 203;
	        flats[1][3]= 204;
	        flats[2][0] = 301;
	        flats[2][1] = 302;
	        flats[2][2] = 303;
	        flats[2][3]= 304;

	        // Displaying the 2-D Array (for loop)
	        System.out.println("Printing a 2-D array using for loop");
	        for(int i=0;i<3;i++)
	        {	        	
	            for(int j=0;j<4;j++) {
	                System.out.print(flats[i][j]);
	                System.out.print(" ");
	            }
	           System.out.println("");
	        }

	    }
	}
