
package javabasic;

import java.util.Scanner;


public class vowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter");
        ch=input.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='0'||ch=='U')
        {
            System.out.println("vowel");
            
        }
        else{
            System.out.println("consonant");
        }
    }
    
}
