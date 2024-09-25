package Strings;
import java.util.Scanner;

public class StringFifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        String cadenaReversa = new StringBuilder(cadena).reverse().toString();

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena al revés: " + cadenaReversa);
    }
}