package src;
import java.util.Scanner;
public class UserEntrance {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username:");
        username = input.nextLine();
        System.out.print("Enter your password:");
        password = input.nextLine();
        if (username.equals("Serena")&&password.equals("180623")) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("Something went wrong!");
        }

    }
}