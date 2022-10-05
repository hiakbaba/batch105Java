package ders04_matematikselislemler_IncrementDecrement;

public class C01_DataCasting {

    public static void main(String[] args) {


        int sayi1=20;
        int sayi2=6;

        System.out.println(sayi1/sayi2); //3,66666666666 sonuç bu ama int bize sadece 3 gösterir. virgülden sonrasını siler.
                                            //java sonucun sadece tamsayı kısmını gösterir.

        double sayi3=6;

        System.out.println(sayi1/sayi3);
    }
}
