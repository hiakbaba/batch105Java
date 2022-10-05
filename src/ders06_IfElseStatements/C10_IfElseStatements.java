package ders06_IfElseStatements;

public class C10_IfElseStatements {
    public static void main(String[] args) {

        /* kullanıcıdan cibsiyetini ve yasini alin, kadin 60 yas ve üzeri, erkek 65 yas ve üzeri emekli olabilir.
        erkek 65 yas ve üzeri emekli olabilir
        cinsiyet ve yasini dikkate alarak
        "emekl,i olabilirsin" veya "emekli olmaka icin... yıl daha calisman gerekir" yazdirin
         */

        char cinsiyet ='E';
        int yas=16;

        if (cinsiyet=='E' && yas>65){
            System.out.println("emekli olabilirsin");
        } else if(cinsiyet=='E' && yas<65 && yas>15){
            System.out.println("emekli olmak icin daha " + (65-yas)+ " sene calismalisin");
        } else if(cinsiyet=='K' && yas>=60){
            System.out.println("emekli olabilirsin");
        } else if(cinsiyet=='K' && yas<60 && yas>15){
            System.out.println("emekli olmak icin daha " + (60-yas)+ " sene calismalisin");
        } else {

            System.out.println("gecersiz giris");
        }
    }
}
