
package javabasic;

import java.util.Scanner;


public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1,num2,maximum,minimum;
        System.out.println("Enter 2 numbers =");
        num1=input.nextDouble();
        num2=input.nextDouble();
        maximum=(num1>num2)?num1:num2;
        System.out.println("maximum ="+maximum);
        minimum=(num1<num2)?num1:num2;
        System.out.println("minimum ="+minimum);
    }
    
}
