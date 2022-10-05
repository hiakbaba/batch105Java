package ders09_StringManipulations;

public class C06_substring {

    public static void main(String[] args) {
    String str="Java ogren, isi kap";

        System.out.println(str.substring(5)); //ogren, isi kap

        System.out.println(str.substring(0)); // Java ogren, isi kap

        System.out.println(str.length()); // 19

        // son karakteri string olarak kaydedin.

        String sonHarf=""+str.charAt(str.length()-1);
        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);
        // son index deki karakteri upperCase olarak yazdirin.

        System.out.println(str.substring(str.length()-1).toUpperCase());
        // son 3 harfi buyuk olarak yazdirin

        System.out.println(str.substring(str.length()-3).toUpperCase());
    }
}
