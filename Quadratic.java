//Write a program to check whether roots of a given quadratic equation are real & distinct, real & equal or imaginary roots 
import java.util.*;
class Quadratic{
    public static int root(int a, int b,int c){
        int eques=(b*b)-(4*a*c); 
        return eques;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of a b and c : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int D= root(a,b,c);
        if(D>0){
            System.out.println(D+" Real & distinct");
        }else if(D==0){
            System.out.println(D+" real & equal");
        }else{
            System.out.println(D+" Imaginary roots ");
        }
    }
}