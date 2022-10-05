package ders03_datacastingWrapperClass;

public class C01_DataCasting {

    public static void main(String[] args) {

        /*
        bazı data turleri birbirine cast edilemez.
         */
       // String  str = 20;
       //   boolean mutlu="true";

      double s=20;
      int sayi=15;
      long ln=sayi; // esitligin sol tarafi long, sag tarafi yani deger int, ama java itiraz etmedi.

        /*
        dar data turunden bir degeri, genis data turundeki variable'a atama yaparsanız java bunu otomatik olarak yapar.
        kucuk data turu buyuk data turune cevrılır
         */
      short sh=23;
      int a=sh;

      long lng=sh;

      float fl=lng;

        /*
         ama tersini yapmak istersek, buyuk data turundeki bir veriyi kucuk data
        turundeki variable'a atamak istersek java kabul etmez.

        */

        double dbl=20;
        // a=dbl;   java kabul etmez. buyuk kucuge cevrilemedigi icin.

        // short abc=dbl;   java kabul etmez.  buyuk kucuge cevrilemedigi icin.


    }
}
