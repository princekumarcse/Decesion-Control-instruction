//Write a program to print greater between two numbers. Print one number of both are the same. 

import java.util.*;
class GreaterAmongTwo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" Is Greater");
        }else if(num1==num2){
             System.out.println(num1+" And "+num2 +" Are Same");
        }else{
             System.out.println(num2+" Is Greater");
        }
    }
}