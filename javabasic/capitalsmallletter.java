
package javabasic;

import java.util.Scanner;


public class capitalsmallletter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("enter any letter =");
        ch=input.next().charAt(0);
        if(ch>='a' && ch<= 'z')
        {
            System.out.println("This is a small letter");
            
        }
        else if (ch>='A' && ch <='Z')
            {
                System.out.println("this is capital letter");
            }
            else{
                System.out.println("this is not letter its digit");
            }
        
        
    }
    
}
