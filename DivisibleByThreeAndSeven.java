//Write a program to check whether a given number is divisible by 7 or divisible by 3. 
import java.util.*;
public class DivisibleByThreeAndSeven{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int num=sc.nextInt();
        if(num%3==0 && num%7==0){
            System.out.println(num+" Is Divisible by 3 And 7");
        }else{
            System.out.println(num+" Is not Divisible by 3 And 7");
        }
    }
}