package src;

import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        int tutar;
       
        double hesap;
        Scanner input =new Scanner(System.in);
        System.out.println("KDV siz hesap:");
        tutar = input.nextInt();
        hesap =((tutar*0.18)+tutar);
        System.out.println("odenecek tutar:"+hesap);





         
    }
}