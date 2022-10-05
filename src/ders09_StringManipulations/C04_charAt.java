package ders09_StringManipulations;

public class C04_charAt {

    public static void main(String[] args) {

        String str="Java Candir";
        System.out.println(str.charAt(0)); // ilk harf olan J yi verir.
        System.out.println(str.charAt(5)); // C verir.
        System.out.println(str.charAt(10)); // r verir

        /*
        bir metindeki karakter sayisi ile son indeks arasinda 1 fark vardir. index 0 dan başladıgi icin.
        bu metin icin karakter sayisi 11 ama son index 10 dur.

         */
       // System.out.println(str.charAt(15)); // String index out of range: 15




    }
}
