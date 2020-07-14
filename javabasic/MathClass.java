
package javabasic;

import java.util.Scanner;


public class MathClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.println("Enter 1st  number =");
        x=input.nextInt();
        System.out.println("Enter 2nd number = ");
        y=input.nextInt();
        
        
        System.out.println("Mximum ");
        
        System.out.println(Math.max(x, y));
        
        
        System.out.println("Minimum");
        
        System.out.println(Math.min(x, y));
       
    }
    
}
