//Write a program to check whether a given number is positive or non-positive. 
import java.util.*;
class PosOrNeg{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter A Number: ");
     int num=sc.nextInt();
     if(num>=0){
        System.out.println(num+" : Is Positive");
     }else{
        System.out.println(num+" : Is Negative");
     }
    }
}