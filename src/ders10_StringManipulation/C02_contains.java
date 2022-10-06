package ders10_StringManipulation;

public class C02_contains {

    public static void main(String[] args) {

        String str="Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok")); //true

        System.out.println(str.contains("odla")); // true

        System.out.println(str.contains("a")); // true, a'nın sayisi önemli değil var mi yok mu ona bakar.

        //    System.out.println(str.contains('a')); // parametre olarak char kabul etmez.
        // CharSequence : char dizisi
        System.out.println(str.contains("java")); // false, kucuk harfle j yazdigimiz icin.

        String str2="Java";

        System.out.println(str.contains(str2)); //true
        String str3="234 Ali Can";

        //str3.contains(2);
        str3.contains("2");









    }
}
