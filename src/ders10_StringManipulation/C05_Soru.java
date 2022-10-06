package ders10_StringManipulation;

import java.util.Scanner;

public class C05_Soru {

    public static void main(String[] args) {

        /*
        mail kontrolu yapan bir program hazirlayin.
        1- mail @ isareti icermiyorsa gecersiz email yazdiralim.
        2- @ isareti iceriyor ama @gmail.com icermiyorsa "gmail adresi giriniz" yazsin
        3- @gmail.com ile bitmiyorsa yazim hatasi versin.

        seklinde sonuc yazdirin.

         */

        String email="ibrahim@abc.com";

        if (!email.contains("@")) {

            System.out.println("gecersiz email");

        } else if(!email.contains("@gmail.com")){

            System.out.println("gmail adresi giriniz");
        } else if (!email.endsWith("@gmail.com")){
            System.out.println("yazim hatasi");
        } else {
            System.out.println("email basari ile kaydedildi");
        }

    }

}
