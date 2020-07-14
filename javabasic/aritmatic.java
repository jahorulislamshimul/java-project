
package javabasic;

import java.util.Scanner;


public class aritmatic {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double num1,num2,result;
        System.out.println("Enter 1st digit =");
        num1 =input.nextInt();
        System.out.println("Enter 2nd digit =");
        num2 =input.nextInt();
        
        result=num1+num2;
        System.out.println("Sum ="+result);
        result=num1-num2;
        System.out.println("Sub ="+result);
        result=num1*num2;
        System.out.println("mul ="+result);
        result=num1/num2;
        System.out.println("div ="+result);
        result=num1%num2;
        System.out.println("rem ="+result);
        
        }
    
    
}

