package src;


import java.util.*;



public class Main {
    public static void main(String[] args) {
        int mat,tarih,fizik,kimya,muzik,turkce;
        Scanner input= new Scanner(System.in);
        System.out.println("matematik notu:");
        mat =input.nextInt();
       
        System.out.println("tarih notu:");
        tarih = input.nextInt();
       
        System.out.println("fizik notu:");
        fizik= input.nextInt();
        
        System.out.println("kimya notu:");
        kimya= input.nextInt();
        
        System.out.println("muzik notu:");
        muzik=input.nextInt();
        System.out.println("turkce notu:");
        turkce=input.nextInt();
        double sonuc =((muzik+tarih+fizik+turkce+mat+kimya)/6.0);
        System.out.println("Not ortalamasi:"+sonuc);



    }
    
}
