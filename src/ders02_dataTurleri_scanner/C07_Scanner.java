package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John Soyisminiz : Doe Yasiniz : 44 Kaydiniz basariyla tamamlanmistir

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz : ");
        String isim=scan.nextLine();  // string için kullanilabilen next sadece ilk space e kadar olan kismi alir,
        // next.Line ise o satirda yazilan tüm bilgiyi alir.

        System.out.println("Lutfen soyadinizi giriniz :");
        String soyIsim=scan.next();

        System.out.println("Lutfen yasinizi giriniz :");
        double yas=scan.nextDouble();

        System.out.println("Isminiz :" + isim + "\nSoyisminiz :" + soyIsim
        + "\nyasiniz :" + yas + "\nkaydiniz basariyla tamamlanmistir" );



    }
}
