package practiceSets;

import java.util.Scanner;

public class PS2 {

    public static void main(String[] args) {
    	float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
        
//        --------------------------------
        
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
//        =====================================
    	
    	
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>8);
        System.out.println(7*49/7+35/7);
    }
}
