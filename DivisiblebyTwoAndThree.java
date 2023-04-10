// Write a program to check whether a given number is divisible by 3 and divisible by 2. 
import java.util.*;
public class DivisiblebyTwoAndThree{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Any Number: ");
    int num=sc.nextInt();
    if(num%2==0 && num%3==0){
        System.out.println("Number is Divisible by 2 And 3");
    }else{
        System.out.println("Number is Not Divisible by 2 And 3");
    }
}
}