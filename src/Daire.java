package src;
import java.util.Scanner;
import java.lang.Math.*;  

public class Daire {
    

    public static void main(String[] args){
        double yaricap;
        Scanner input=new Scanner(System.in);
        System.out.print("Yaricap uzunlugu:");
        yaricap=input.nextDouble();
        double cevre=  (2 *Math.PI* yaricap);
        double alan=(Math.PI* yaricap*yaricap);
        System.out.println("Cevre:"+cevre);
        System.out.println("Alan:"+alan);
    }
    
}
