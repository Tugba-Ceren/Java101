package src;
import java.util.Scanner;

public class Order3numb {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first one:");
        a=input.nextInt();
        System.out.println("Enter the second one:");
        b=input.nextInt();
        System.out.println("Enter the third one");
        c=input.nextInt();
        int smallest = Math.min(a, Math.min(b, c));
        System.out.println("Smallest number is :"+smallest);
    }
    
}
