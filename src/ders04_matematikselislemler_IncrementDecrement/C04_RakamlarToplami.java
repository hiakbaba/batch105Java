package ders04_matematikselislemler_IncrementDecrement;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        /*
       SORU:  kullanıcinin girdigi 4 basamakli bir sayinin rakamlari toplamini bulunuz.
         */

        int input=14355;

        int birlerBasamagi;
        int rakamlarToplami=0;

        //1-birler basamagini al
        birlerBasamagi=input % 10; //3
        //2- birler basamagini rakamlar toplamina ekle
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //3
        //3- birler basamagindan kurtul
        input =input/10;


        birlerBasamagi=input % 10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input =input/10;

        birlerBasamagi=input % 10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input =input/10;

        birlerBasamagi=input % 10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input =input/10;

        birlerBasamagi=input % 10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input =input/10;

        System.out.println("verilen sayinin rakamlar toplami :"+ rakamlarToplami);
    }
}
