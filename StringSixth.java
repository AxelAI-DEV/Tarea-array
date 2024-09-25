package Strings;
import java.util.Scanner;

public class StringSixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String string1 = sc.nextLine();

        String result = processString(string1);
        System.out.println("Resultado: " + result);
    }

    public static String processString(String string1) {
        int length = string1.length();
        if (length == 0) {
            return "";
        }

        char firstChar = string1.charAt(0);
        char lastChar = string1.charAt(length - 1);

        if (length % 2 == 0) {
            return "" + firstChar + lastChar;
        } else {
            char middleChar = string1.charAt(length / 2);
            return "" + firstChar + middleChar + lastChar;
        }
    }
}