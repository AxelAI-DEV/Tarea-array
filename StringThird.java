package Strings;
import java.util.Scanner;

public class StringThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena (string1): ");
        String string1 = sc.nextLine();

        System.out.print("Ingrese la segunda cadena (string2): ");
        String string2 = sc.nextLine();

        if (string1.length() > string2.length()) {
            if (string1.contains(string2)) {
                System.out.println("string2 es un substring de string1.");
            } else {
                System.out.println("string2 no es un substring de string1.");
            }
        } else {
            System.out.println("El tamaño de string1 no es mayor que el tamaño de string2.");
        }
    }
}