
package javabasic;

import java.util.Scanner;


public class MathPow {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       int x,y;
        System.out.println("Enter 1st number =");
        x=input.nextInt();
        System.out.println("Enter 2nd number =");
        y=input.nextInt();
        
        double  power=Math.pow(x, y);
        System.out.println("power ="+power);
        
        double round =Math.round(3.49999999999);
        System.out.println("round "+round);
        
                
    }
    
    
}
