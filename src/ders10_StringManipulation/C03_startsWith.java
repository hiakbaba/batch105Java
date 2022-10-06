package ders10_StringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str="manti acarken java ogrenilmez";

        System.out.println(str.startsWith("Manti")); // false

        System.out.println(str.startsWith("m")); // true

        System.out.println(str.startsWith("manti acarken java ogrenilmez")); // true

        System.out.println(str.startsWith("")); // true, hiçlik




    }
}
