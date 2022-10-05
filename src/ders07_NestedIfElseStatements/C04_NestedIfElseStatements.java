package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {

    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        //ana degisken yas olsun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz :");
        double yas=scan.nextDouble();

        System.out.println("Lutfen cinsiyetinizi giriniz E/K :");
        char cinsiyet=scan.next().charAt(0);  // charAt(0) bize ilk kelimenin ilk karakterini verir.

        if (yas<15){
            System.out.println("hatali yas girisi");

        } else if(yas<60){
            // emekli olamaz calismasi gereken süre cinsiyete bagli

            System.out.println("emekli olamazsin");
            if (cinsiyet=='K' || cinsiyet=='k'){
                System.out.println("daha "+ (60-yas)+ " sene calismalisin");
            } else if(cinsiyet=='E'|| cinsiyet=='e'){
                System.out.println("daha "+ (65-yas)+ " sene calismalisin");
            }else {
                System.out.println("hatali cinsiyet girisi");
            }

        } else if(yas<65){
            //kadin ise emekli olabilir, erkek ise calismasi lazim
            if (cinsiyet=='K' || cinsiyet=='k'){
                System.out.println("emekli olabilirsin");
            } else if(cinsiyet=='E'|| cinsiyet=='e'){
                System.out.println("emekli olmak icin " +(65-yas)+ " yil daha calismalisin");
            } else {
                System.out.println("hatali cinsiyet girisi");
            }

        } else {
            System.out.println("emekli olabilirsin"); // yas 65 ten buyukse
        }





    }
}
