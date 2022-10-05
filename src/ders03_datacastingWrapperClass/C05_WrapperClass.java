package ders03_datacastingWrapperClass;

public class C05_WrapperClass {

    public static void main(String[] args) {

        int sayi=10;
        String str="java cok guzel";

        /*
        primitice data turleri sadece deger barindirilar, hazir method'lari yoktur.
        java'ya yapilan talepler sonucunda java primitive data turleri ile bazi hazır method'larin
        kullanilmasi icin wrapper class'lar olusturmustur.

        Wrapper class'lar primitive data turlerindeki degerleri alirlar ancak methodlari da vardır.
         */

        char krk='b';

        Character krkWrapper='c';

        System.out.println(Character.isLetter('5')); //false
        System.out.println(Character.isDigit('7')); //True

        String str1="123";
        String str2 ="12";

        // str1 ve str2 degerlerini matematiksel olarak toplayin

        System.out.println( str1+str2); //12312

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); //135

        System.out.println(Integer.MAX_VALUE); // 2147483647

        System.out.println(Short.MIN_VALUE); //-32768
        short s1=20;
        int s2=s1;





    }
}
