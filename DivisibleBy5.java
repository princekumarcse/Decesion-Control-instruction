//Write a program to check whether a given number is divisible by 5 or not 
import java.util.*;
class DivisibleBy5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println(num+" Is Divisible by 5");
        }else{
            System.out.println(num+" Is Not Divisible by 5");
        }
    }
}