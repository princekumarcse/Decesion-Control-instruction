//Write a program to check whether a given number is an even number or an odd number. 
import java.util.*;
class EvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number :");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+" is Odd");
        }
    }
}