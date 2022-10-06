package ders10_StringManipulation;

public class C07_Soru {
    public static void main(String[] args) {


        /* kullanicidan bir cumle ve bir metin alin
            cumlede metnin durumuna gore asagidakilardan uygun olani yazdirin
         1- cumle metni icermiyor
         2- cumle metni sadece bir kere iceriyor
         3- cumle metni birden fazla iceriyor.
            seceneklerinden uygun olani yazdirin

         */


        String cumle="java cok guzeldir cok";

        String metin="sss";

        if (!cumle.contains(metin)){

            System.out.println("cumle metni icermiyor");
        } else {
            int ilkIndex=cumle.indexOf(metin);
            int ikinciIndex=cumle.indexOf(metin,ilkIndex+1);

            if(ikinciIndex==-1){

                System.out.println("cumle metni sadece 1 kez iceriyor");

            } else {

                System.out.println("cumle metni birden fazla iceriyor");
            }

        }





    }
}
