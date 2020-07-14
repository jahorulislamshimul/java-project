
package javabasic;

import java.util.Scanner;


public class MathAbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x ;
        System.out.println("enter number=");
        x=input.nextInt();
        
        
        int absolute=Math.abs(x);
        System.out.println("Result of x ="+absolute);
    }
    
}
