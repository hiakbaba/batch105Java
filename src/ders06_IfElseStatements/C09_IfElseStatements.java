package ders06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseStatements {

    public static void main(String[] args) {
        //kullanıcıdan bir tamsayi alin
        // sayi negatifse "geçersiz sayı "
        // tek basamaklı ise "rakam"
        // iki basamaklı ise "iki basamakli sayi" yazdırsın
        // bunun disindakiler icin "buyuk sayi" yazdirsin

        int sayi=100;

        if (sayi<0){
            System.out.println("gecersiz sayi");
        } else if(sayi<10){
            System.out.println("rakam");
        } else if(sayi<100){
            System.out.println("sayi iki basamakli");
        } else {
            System.out.println("buyuk sayi");
        }
    }
}
