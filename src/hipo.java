package src;
import java.util.Scanner;


public class hipo {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("a kenari:");
        a=input.nextInt();
        System.out.println("b kenari");
        b=input.nextInt();
        double c=Math.hypot(a,b);
        System.out.println("C kenari:"+c);
    }

   
}
    

