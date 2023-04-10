//Write a program which takes the cost price and selling price of a product from the user. Now calculate and print profit or loss percentage. 
import java.util.*;
class ProfitLoss{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Selling Price: ");
        float Sp=sc.nextFloat();
        System.out.println("Enter Cost Price: ");
        float CP=sc.nextFloat();
        if(Sp>CP){  
            float profit=Sp-CP; 
            float proper=(profit/CP)*100;
            System.out.println(profit+" % Profit");
         }else{
             float loss=CP-Sp;
             float lossPer=(loss/CP)*100;
             System.out.println(lossPer+" % Loss");
         }
    }
}