import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scan.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scan.next();
        System.out.println("Podaj wiek: ");
        int wiek = scan.nextInt();
        System.out.println("Podaj nr. indeksu: ");
        int indeks = scan.nextInt();

        System.out.println(imie + " " + nazwisko + ". Wiek: " + wiek + ". Indeks: " + indeks + ".");
        System.out.printf("%s %s, wiek: %d, indeks: %d \n", imie, nazwisko, wiek, indeks);
        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        int a = 20;
        int b = 15;

        System.out.println("a+b=" + (a+b) + ", a-b=" + (a-b) + ", a*b=" + (a*b) + ", a/b=" + (a/b) + ", a%b=" + (a%b));
    }
}
