import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        Random gen = new Random();
        double[] tablica = new double[5];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = gen.nextDouble()*100;
        }

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }

    }
}
