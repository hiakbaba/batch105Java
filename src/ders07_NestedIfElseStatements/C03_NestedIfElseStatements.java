package ders07_NestedIfElseStatements;

public class C03_NestedIfElseStatements {

    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet='K';
        int yas=56;


        // nested if-else seklinde kullanim icin önce ana degiskeni secip ona gore ana yapiyi olusturalim
        // cinsiyet ana degiskenimiz olsun

        if (cinsiyet=='k' || cinsiyet=='K'){
            // giris yapilan deger bir kadina aittir demektir.
            if (yas<15){
                System.out.println("hatali yas girisi");
            } else if(yas<60){
                System.out.println("Emekli olamazsın, daha " + (60-yas)+ " yıl calismalisin");
            } else {
                System.out.println("emekli olabilirsin");
            }
            System.out.println("");
        } else if( cinsiyet=='e' || cinsiyet=='E'){
            // giris yapilan deger bir erkege aittir demektir.
            if (yas<15){
                System.out.println("hatali yas girisi");
            } else if(yas<65){
                System.out.println("Emekli olamazsın, daha " + (65-yas)+ " yıl calismalisin");
            } else {
                System.out.println("emekli olabilirsin");
            }
            System.out.println("");

        } else {
            System.out.println("Yanlis cinsiyet girisi");
        }



    }
}
