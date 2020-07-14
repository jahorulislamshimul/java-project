
package javabasic;

import java.util.Scanner;


public class areaofcircel {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double r,area;
            System.out.println("enter radius=");
            r=input.nextDouble();
            area=3.1416*r*r;
            System.out.println("area of circel="+area);
        
    }
    
}
