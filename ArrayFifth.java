package Array;
import java.util.Scanner;

public class ArrayFifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        int[] arr_int = new int[n];

        for (int i = 0; i < n; i++) {
            arr_int[i] = i * 2;
        }

        // Invertir el arreglo en su lugar
        for (int i = 0; i < n / 2; i++) {
            int temp = arr_int[i];
            arr_int[i] = arr_int[n - 1 - i];
            arr_int[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr_int[i] + " ");
        }
    }
}