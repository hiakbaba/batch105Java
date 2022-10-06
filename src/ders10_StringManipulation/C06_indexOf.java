package ders10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="İbrahim Hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 3 ilk a nın indexini döndürür.

        System.out.println(str.indexOf('c')); // c nin ilk kullanildigi indexi döndürür

        System.out.println(str.indexOf("hersey")); // 17 hersey kelimesinin basladigi h nin indexini döndürür.

        System.out.println(str.indexOf("e", 9)); //15 , 9.index sonrasi ilk e olan index 15 i verir.

        System.out.println(str.indexOf("e", 16));

        // cumledeki 2. c nin indexini yazdirin.

        int ilkcindex=str.indexOf("c");

        System.out.println(str.indexOf("c", ilkcindex+1)); // 24

        System.out.println(str.indexOf("ali")); // -1  index olarak int dondurmesi bekleniyor







    }
}
