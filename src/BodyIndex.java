package src;
import java.util.Scanner;
import java.lang.Math.*;  


public class BodyIndex {
    public static void main(String[] args){
        double weight,height;
        Scanner input = new Scanner(System.in);
        // Use m
        System.out.print("Enter height:");
        height=input.nextDouble();
        // Use kg
        System.out.print("Enter weight:");
        weight=input.nextDouble();
        Double BodyIndex=(weight/(height*height));
        System.out.println("Your Body index is :"+ BodyIndex);
        
    }
    
}
