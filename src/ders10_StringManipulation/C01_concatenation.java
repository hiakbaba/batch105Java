package ders10_StringManipulation;

public class C01_concatenation {

    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzeldir";
        boolean bl=true;
        int sayi=20;
        double dbl=3.54;

        System.out.println(str1+bl+sayi); //Javatrue20

        //System.out.println(bl+sayi);
        //string disindaki data turlerinde toplamaya izin verilmeyebilir.

        System.out.println(sayi+dbl); //23.54

       // System.out.println(str1.concat(bl)); // concat() metodu sadece String variable'lari birlestirmek icin kullanilir.

        System.out.println(str1.concat(" ").concat(str2));

    }
}
