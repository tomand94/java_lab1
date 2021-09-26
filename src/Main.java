import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj x: ");
        int x = scan.nextInt();
        System.out.println("Podaj y: ");
        int y = scan.nextInt();
        System.out.println("Podaj z: ");
        int z = scan.nextInt();

        if (x>y && x>z) {
            System.out.println("x jest wieksze od y i z");
        } else if (x<y && x>z) {
            System.out.println("x jest wieksze od z, ale mniejsze od y");
        } else if (x<y && x<z) {
            System.out.println("x jest mniejsze od y i z");
        } else if (x>y && x<z) {
            System.out.println("x jest wieksze od y, ale mniejsze od z");
        }

        boolean a = false;
        boolean b = true;
        boolean c = false;
        System.out.println(!(a) || b || c);
        System.out.println(!((a || c) && (!a && b)));
    }
}
