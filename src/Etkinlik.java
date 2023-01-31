package src;
import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        double degree;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the tempature?:");
        degree = input.nextDouble();
        if (degree<5){
            System.out.println("Go for ski");
        }
        else if (degree<=25){
            if(degree<=15){
                System.out.println("Go to Cinema");
            }
            if (degree>=10){
                System.out.println("Go for picnic.");

            }
        else {
            System.out.println("Go for swimming");
        }    

        }


    }
}

   

