import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        int zmienna1 = 5;
        double zmienna2 = 2.4;
        byte zmienna3 = -20;
        boolean zmienna4 = false;
        String zmienna5 = "Testowy string.";
        float zmienna6 = 12.22f;
        System.out.println(zmienna1);
        System.out.println(zmienna2);
        System.out.println(zmienna3);
        System.out.println(zmienna4);
        System.out.println(zmienna5);
        System.out.println(zmienna6);

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */

        int liczbaA = 15;
        int liczbaB = 10;
        double liczbaX = 5.5;
        double liczbaY = 3.5;
        int sum1 = liczbaA+liczbaB;
        int sub1 = liczbaA-liczbaB;
        int mul1 = liczbaA*liczbaB;
        int div1 = liczbaA/liczbaB;
        int mod1 = liczbaA%liczbaB;

        double sum2 = liczbaX+liczbaY;
        double sub2 = liczbaX-liczbaY;
        double mul2 = liczbaX*liczbaY;
        double div2 = liczbaX/liczbaY;
        double mod2 = liczbaX%liczbaY;



    }
}
