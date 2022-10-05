package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {

        System.out.println('a'+'b'); // ascii tablosuna göre değerlerini topladı. char'da sayi degerlerini kullanıyor.
        //kullanicidan char bir karakter alin,
        // o karakterden sonra gelen 3 karakteri yazdirin
        // ornek input :a , output: bcd olsun

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz : ");

        char girilenKrk=scan.next().charAt(0); // javada her girilen datanın indexi var. ilki 0, ikincisi 1, ...
                                                // buradaki 0 ilk karakter demektir yani 0. burada string olarak aldık ilk başta.
                                                 // aşağıda char'a çevirdik, sonra tekrar "" ile stringe çevirdik.

        System.out.println(""+(char)(girilenKrk+1)+(char)(girilenKrk+2)+(char)(girilenKrk+3)); // ascii kodlarından 1'er fazlasini topladı.

        // sonra matematiksel char'a çevirmek için başına char ekledik. sonrada stringe çevirmek için başına hiçlik "" ekledik.





    }
}
