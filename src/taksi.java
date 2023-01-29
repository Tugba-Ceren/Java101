package src;
import java.util.Scanner;


public class taksi {
    public static void main(String[] args){
        double mesafe;
        Scanner input =new Scanner(System.in);
        System.out.print("Gidilen mesafe:");
        mesafe=input.nextDouble();
        double taksimetre=((mesafe*2.20)+10);
        if (taksimetre<20){
            System.out.println("odenecek tutar 20tl");
        }
        else {
            System.out.println("odenecek tutar"+taksimetre);
        }
    }   
}
