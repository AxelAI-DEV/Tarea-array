package Array;
import java.util.Scanner;

public class ArrayThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el tamaño del arreglo por el usuario
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        // Crear el arreglo con tamaño n
        int[] arr_int = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número entero: ");
            int num = scanner.nextInt();
            arr_int[i] = num;
        }

        int[] arr_int2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr_int2[i] = arr_int[n-1-i];
        }

        // 2Imprimir ambos arreglos
        System.out.println("Arreglo original:");
        for (int i : arr_int) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Arreglo invertido:");
        for (int i : arr_int2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
