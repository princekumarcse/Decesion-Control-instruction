//Write a program to find the greatest among three given numbers. Print number once if the greatest number appears two or three times. 

import java.util.*;
class GreatestAmongThree{
    public static int Greatest(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int max=Greatest(num1,num2,num3);
         if(num1==num2 || num1==num3 || num2==num3){
            System.out.println(num1+ " And "+ num2+" Are Same");
          
        }else{
            System.out.println(max + " Is Greater");
        }
        
    }
}