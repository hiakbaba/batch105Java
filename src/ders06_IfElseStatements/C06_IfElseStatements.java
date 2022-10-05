package ders06_IfElseStatements;

public class C06_IfElseStatements {

    public static void main(String[] args) {


        /*

        if else statement'ta süslü parantez kullanmazsak hem if body'si hemde else body'si için sadece
        bir satır kabul eder.

        yani süslü parantezleri silersek eğer, ilk satırdan sonrakini if-else ile ilişkilendirilmez ve her durumda çalışır.
        ilk ; den sonrasını else body si olarak görmez.
         */
        int not=56;

        if(not>=50) {

            System.out.println("sinifi gectin");
            System.out.println("yazın kafan rahat");
        }else {
            System.out.println("bu dersten kaldın");
            System.out.println("bu dersten kaldin");
        }

    }
}
