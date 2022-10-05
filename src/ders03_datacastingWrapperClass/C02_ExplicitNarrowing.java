package ders03_datacastingWrapperClass;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi=20;

        /*
        genis data turundeki bir degeri
        dar data turundeki bir variable'a atamak istersek java sorumlulugu almamizi ister.

        bu sorumlulu almak icin cast edecegimiz degerin onune () ıcerısınde
        cast etmek istedigimiz data turu gelir.

        ancak bu durumda data kayiplari veya baskalasim olabilir.

         */
        short sh=(short)sayi;

        System.out.println(sh); //20

        double dbl= 23.5;

        int say=(int)dbl;

        System.out.println(say); // virgulden sonrasını atar ve tamsayi 23 gosterir.

        say =-128;// int

        byte byt=(byte)say;

        System.out.println(byt); // 115



    }
}
