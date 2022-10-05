package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin 2 kenar uzunlugunu sirayla giriniz :" +
                "\niki kenar uzunlugu arasında enter'a basin !!!");
        double kenar1= scan.nextDouble();
        double kenar2=scan.nextDouble();

        System.out.println("diktortgenin alani : "+ (kenar1*kenar2));
    }
}
