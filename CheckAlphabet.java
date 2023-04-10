//rite a program to check whether a given alphabet is in uppercase or lowercase. 
import java.util.*;
public class CheckAlphabet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Alphabet: ");
        char  alphabet=sc.next().charAt(0);
        if(alphabet>'a' && alphabet<'z'){
            System.out.println(alphabet+" Is in LowerCase");
        }else{
            System.out.println(alphabet+" Is in UpperCase");
        }
    }
}