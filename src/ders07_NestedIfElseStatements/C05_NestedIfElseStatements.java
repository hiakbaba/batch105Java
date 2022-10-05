package ders07_NestedIfElseStatements;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin

        int urunAdedi=7;
        boolean kartvarmi=true;
        double listeFiyati=20;
        double toplamFiyat=0;
        // ana degisken kart olsun

        if (kartvarmi){
            // kart var
            if(urunAdedi<0){
                System.out.println("hatali urun adedi girisi");
            } else if(urunAdedi<10){
                toplamFiyat=urunAdedi*listeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat : "+ toplamFiyat+ " TL");
            } else {
                toplamFiyat=urunAdedi*listeFiyati*0.8;
                System.out.println("%20 indirimli toplam fiyat : "+ toplamFiyat+ " TL");
            }
        } else {
            // kart yok
            if(urunAdedi<0){
                System.out.println("hatali urun adedi girisi");
            } else if(urunAdedi<10){
                toplamFiyat=urunAdedi*listeFiyati*0.9;
                System.out.println("%10 indirimli toplam fiyat : "+ toplamFiyat+ " TL");
            } else {
                toplamFiyat = urunAdedi * listeFiyati * 0.85;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat+ " TL");
            }
        }

    }
}
