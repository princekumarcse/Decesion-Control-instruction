//Write a program to check whether a given number is a three-digit number or not. 

import java.util.*;
class CheckThreeDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter Any Numbers: ");
           int num=sc.nextInt();
           int count=0;
           while(num!=0){
            int rem=num%10;
            count++;
            if(count==4)
            break;
            num=num/10;
           } 
           if(count==4){
            System.out.println("Not have Three Digit");
            
           }else{
            System.out.println("Given Number Have Three Digits");
           }
    }
}