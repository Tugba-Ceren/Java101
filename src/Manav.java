package src;
import java.util.Scanner;

public class Manav {
    public static void main(String[] args){
        /*Armut : 2,14 TL
          Elma : 3,67 TL
          Domates : 1,11 TL
          Muz: 0,95 TL
          Patlıcan : 5,00 TL*/
          double armut,elma,domates,muz,patlican;
          Scanner input = new Scanner(System.in);
          System.out.print("Elma agirlik:");
          elma=input.nextDouble();
          System.out.print("Armut agirlik:");
          armut=input.nextDouble();
          System.out.print("Muz agirlik:");
          muz=input.nextDouble();
          System.out.print("Domates agirlik:");
          domates=input.nextDouble();
          System.out.print("Patlican agirlik:");
          patlican=input.nextDouble();
          double tutar =(2.14*armut+3.67*elma+domates*1.11+muz*0.95+patlican*5);
          System.out.println("tutar:"+ tutar);
    }
    
}
