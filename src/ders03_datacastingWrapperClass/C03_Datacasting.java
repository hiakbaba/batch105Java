package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_Datacasting {

    public static void main(String[] args) {

        // kullanicidan bir sayi alın
        // kullanici kac sayi girerse girsin
        // konsolda -128 ile 127 arasinda bir sonuc yazdiracak bir kod yazin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz : ");

        int girilenSayi=scan.nextInt();

        byte donusenSayi=(byte)girilenSayi;

        System.out.println("Girdiginiz " + girilenSayi + "'nin donusmus hali :" + donusenSayi );

    }
}
