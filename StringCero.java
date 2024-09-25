import java.util.Scanner;

public class StringCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena (str1): ");
        String str1 = sc.nextLine();

        System.out.print("Ingrese la segunda cadena (str2): ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}