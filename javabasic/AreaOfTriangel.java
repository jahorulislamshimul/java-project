
package javabasic;

import java.util.Scanner;


public class AreaOfTriangel {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        double base,height,area;
        System.out.println("enter base = ");
        base = input.nextDouble();
        System.out.println("enter height =");
        height = input.nextDouble();
        area=0.5*base*height;
        System.out.println("area of triangel="+area);
        
    
    
}
}
