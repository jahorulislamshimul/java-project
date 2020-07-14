
package javabasic;

import java.util.Scanner;


public class gradingsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        System.out.println("Enter your number=");
        num=input.nextDouble();
        if(num<33)
        {
            System.out.println("Your result is =fail");
            System.out.println("Your grade is =F");
        }
        else if  (num>=33 && num<=39.99)
        {
         System.out.println("Your result is =pass");
            System.out.println("Your grade is =D");  
        }
        else if (num>=40 && num<=49.99)
        {
            System.out.println("Your result is =pass");
            System.out.println("Your grade is =C");  
        }
        
        else if (num>=50 && num<=59.99)
        {
            System.out.println("Your result is =pass");
            System.out.println("Your grade is =B");  
        }
        
        else if (num>=60 && num<=69.99)
        {
            System.out.println("Your result is =pass");
            System.out.println("Your grade is =A-");  
        }
        
        else if (num>=70 && num<=79.99)
        {
            System.out.println("Your result is =pass");
            System.out.println("Your grade is =A");  
        }
        else if (num>=80 && num<=100)
        {
            System.out.println("Your result is =pass");
            System.out.println("Your grade is =A");  
        }
        else{
            System.out.println("out of grading system");
        }
        
    }
    
}
