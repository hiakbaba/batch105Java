package ders05_concatenation_operators;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {

        // kullanicidan iki sayi alin
        // eger birinci sayi 100'den kucukse , "ilk sayi 100'den buyuk" yazdirin
        //eger ikinci sayi ciftse, "ikinci sayi cift " yazdirin
        //eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk " yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int s1=scan.nextInt();
        int s2=scan.nextInt();

        // eger birinci sayi 100'den kucukse , "ilk sayi 100'den buyuk" yazdirin

        if (s1>100) {
            System.out.println("ilk sayi 100'den buyuk");
        }
        //eger ikinci sayi ciftse, "ikinci sayi cift " yazdirin

        if(s2%2==0){
            System.out.println("ikinci sayi cift");

        }
        //eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk " yazdirin

        boolean sonuc= s1>s2;
        if (sonuc){
            System.out.println("ilk sayi daha buyuk");
        }


    }
}
