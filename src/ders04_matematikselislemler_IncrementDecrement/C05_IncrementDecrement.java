package ders04_matematikselislemler_IncrementDecrement;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi=10;
        // bu sayiyi 3 artiralim ve yazdiralim.

        sayi+=3; // bunu 3 farkli sekilde artirabiliriz.

        System.out.println(sayi); // 13

        sayi=sayi+3;

        System.out.println(sayi); //16

        int s=10;
        //bu sayiyi 1 artirin;

        s=s+1;

        System.out.println(s);//11

        s+=1; // 12

        System.out.println(s); //12

        s++; // post increment

        System.out.println(s);//13

        ++s;  // pre increment

        System.out.println(s); //14

        int t=10;

        // bu sayinin degerini 1 eksiltelim.

        t-=1; // 9
        t=t-1; // 8
        --t; // 7 pre decrement
        t--;//6  post decrement
        System.out.println(t); // 6


    }
}
