package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen birinci tamsayiyi giriniz :");
        int sayi1=scan.nextInt();

        System.out.println("Lutfen ikinci tamsayiyi giriniz :");
        int sayi2=scan.nextInt();

        int bos;  // 1. durum

        bos= sayi2; // 2. durum

        sayi2=sayi1; // 3. durum

        sayi1=bos; // 4. durum

        System.out.println("sayi1 =" + sayi1);
        System.out.println("sayi2 =" + sayi2);






    }
}
