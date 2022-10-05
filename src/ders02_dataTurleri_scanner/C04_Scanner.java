package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //Kullanicidan ismini alip buyuk harflerle yazdirin


        //1. adım : scan objesi oluşturma
        Scanner scan =new Scanner(System.in);

        //2. adim : kullaniciya ne istediğimizi yazdırma
        System.out.println("Lutfen adinizi giriniz");

        //3. adim : kullanicidan istediğimiz bilginin turune uygun bir variable olsuturup
        //scanner methodlarından uygun olaninin kullanarak alinan degeri variable a atayalim.

        String kullaniciAdi=scan.next();

        System.out.println(kullaniciAdi.toUpperCase());



    }
}
