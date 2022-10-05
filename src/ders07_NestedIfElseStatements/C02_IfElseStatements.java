package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin

        int urunAdedi=25;
        boolean kartVarmi=true;

        double listeFiyati=12.5;
        double toplamFiyat=0;

        if(kartVarmi && urunAdedi>=10){
            toplamFiyat=urunAdedi*listeFiyati*(0.8);
            System.out.println("%20 indirimli toplam fiyatı : " + toplamFiyat);
        } else if (kartVarmi && urunAdedi<10 && urunAdedi>0){
            toplamFiyat=urunAdedi*listeFiyati*(0.85);
            System.out.println("%15 indirimli toplam fiyatı : " + toplamFiyat);
        } else if (!kartVarmi && urunAdedi>=10){
            toplamFiyat=urunAdedi*listeFiyati*(0.85);
            System.out.println("%15 indirimli toplam fiyatı : " + toplamFiyat);
        } else if(!kartVarmi && urunAdedi<10 && urunAdedi>0){
            toplamFiyat=urunAdedi*listeFiyati*(0.9);
            System.out.println("%10 indirimli toplam fiyatı : " + toplamFiyat);
        }
    }
}
