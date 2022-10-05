package ders04_matematikselislemler_IncrementDecrement;

public class C06_Pre_Post_Increment {

    public static void main(String[] args) {

        int a=10;
        // a variable'nin degerini yazdirip, sonra a'nin degerini bir artirin.

        System.out.println("a :"+ a);//10
        a++;
        // a artik 11;

        // b variable'nin degerini 1 artirip sonra yazdirin.
        int b=10;

        b++;
        System.out.println("b :"+b);//11


        // c yi yazdirip 1 artır
        int c=10;

        System.out.println("c :" + c++);


        // d yi 1 artır sonra yazdır;
        int d=10;
        System.out.println("d :" + ++d);

        /*

        c++ veya ++d yi yazdırma veya atama işleminde kullanırsaniz
        c++'e post increment denir. önce işlemi yapar sonra artırmayı yapar
        ++d'e pre increment denir, önce artırır sonra işlemi yapar.
         */


    }
}
