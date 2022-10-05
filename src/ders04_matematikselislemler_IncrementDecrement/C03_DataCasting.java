package ders04_matematikselislemler_IncrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        // kullanicidan iki int deger alip // bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz :");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println(sayi1/sayi2); // 3

        double ondalikliSonuc=(double)(sayi1/sayi2); // (double)(3)=>>3.0

        double dogruSonuc=(double)sayi1/sayi2; // double /int ==>> genis olana göre sonuc verir

        System.out.println(dogruSonuc);

    }
}
