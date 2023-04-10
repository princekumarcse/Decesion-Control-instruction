//Write a program to take marks of 5 subjects from the user. Assume marks are given out of 100 and passing marks is 33. Now display whether the candidate passed the examination or failed
import java.util.*;
public class Student{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Maths Marks: ");
        int math=sc.nextInt();
        System.out.println("Enter Physics Marks: ");
        int phy=sc.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        int chem=sc.nextInt();
        System.out.println("Enter English Marks: ");
        int Eng=sc.nextInt();
        System.out.println("Enter Hindi Marks: ");
        int hindi=sc.nextInt();
        if(math<33){
            System.out.println("Your Maths marks is: "+math);
        }else if(phy<33){
            System.out.println("Your Physics marks is: "+phy);
        }else if(chem<33){
            System.out.println("Your Chemistry marks is: "+chem);
        }else if(Eng<33){
            System.out.println("Your English marks is: "+Eng);
        }else if(hindi<33){
            System.out.println("Your Hindi marks is: "+hindi);
        }
        if(math<33 || phy<33 || chem<33 || Eng<33 || hindi<33 ){
            System.out.println("Your Are Fail");
        }
        else{
            System.out.println("Your Maths marks is: "+math+" Pass");
            System.out.println("Your Physics marks is: "+phy+" Pass");
            System.out.println("Your Chemistry marks is: "+chem+" Pass");
            System.out.println("Your English marks is: "+Eng+" Pass");
            System.out.println("Your Hindi marks is: "+hindi+" Pass");
        }
    }
}