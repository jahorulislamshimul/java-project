
package javabasic;

import java.util.Scanner;


public class assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x;
        int y;
        
        System.out.println("enter x =");
        x=input.nextInt();
        System.out.println("enter y =");
        y=input.nextInt();
        
        x+=y;
        System.out.println("x ="+x); //x=x+y=3+8=11
        y*=x;
        System.out.println("y ="+y); //y=y*x=8*11=88
        x-=y;
        System.out.println("x ="+x);// x=x-y=11-88=-77
        
        x/=y;
        System.out.println("x ="+x); //x=x/y=x/y=-77/88=0
        x+=y;
        System.out.println("x= "+x);  //x=x+y=0+88=88       
       
        y+=x;
        System.out.println("y= "+y);  //y=y+x=88+88=176       
       
        y*=x;
        System.out.println("y= "+y);  //y=y*x=176*88=15488       
       
        x+=y;
        System.out.println("x= "+x);  //x=x+y=88+15488=15576  
        
        y*=x;
        System.out.println("y= "+y);  //y=y*x=15488*15576= 241,241,088     
       
        x+=y;
        System.out.println("x= "+x);  //x=x+y=15576+241,241,088= 241256664
        
        y*=x;
        System.out.println("y= "+y);  //y=y*x=241241088*241256664       
       
        x+=y;
        System.out.println("x= "+x);  //x=x+y=88+15488=15576  
        
        
       
                   
               
    }
}
