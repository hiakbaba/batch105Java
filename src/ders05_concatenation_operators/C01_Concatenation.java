package ders05_concatenation_operators;

public class C01_Concatenation {

    public static void main(String[] args) {

        //sadece asagida verilen variable'lari kullanarak istenen degerleri yazdiralim.

        String s1="Java";
        String s2="Guzeldir";
        String s3="";//hiçlik
        String s4=" "; // space, bosluk

        int sayi1=4;
        int sayi2=3;

        //Java Guzeldir7

        System.out.println(s1+s4+s2+(sayi1+sayi2));// Java Guzeldir7

        //Java Guzeldir12

        System.out.println(s1+s4+s2+sayi1*sayi2); // burada * işlemi daha öncelikli oldugu icin önce bu islem yapilir
                                                    // sonra toplamalar yapilir.

        //34 java

        System.out.println(s3+sayi2+sayi1+s4+s1);
    }
}
