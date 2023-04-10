//Write a program to check whether a given year is a leap year or not. 
import java.util.*;
class LeapYear{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year=sc.nextInt();
        if(year%100==0){
            if(year%4==0){
                System.out.println(year +" Is Leap Year");
            }
        }else if(year%4==0){
            System.out.println(year +" Is Leap Year");
        }else{
            System.out.println(year +" Is Not a Leap Year");
        }
    }
}