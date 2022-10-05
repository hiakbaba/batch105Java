package ders09_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5, 8)); // gun

        // 5. indexten baslar (8-5) karakter yazdirir
        // 5. index dahil (inclusive) , 8.index haric(exclusive)

        // gectikce yazdirin

        System.out.println(str.substring(9,17)); // gectikce
        System.out.println(str.substring(3,7)); // a gu

        String isim = "huseyin";

        //verilen ismi ilk hardi buyuk, geriye kalanlari kucuk harf olarak kaydedin.

        isim=isim.substring(0,1).toUpperCase()+ // ilk harfi aliğp buyuk harf yaptik
             isim.substring(1).toLowerCase();// 1. index ve sonrasini alip kucuk harf yaptik
        System.out.println(isim);


        // sadece 3. indexteki harfi yani a yazdirin

        isim.substring(2,2); // e

       // System.out.println(5,2); // hata verir






    }
}
