package Array;

import java.util.Scanner;

public class ArraySecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el tamaño del arreglo por el usuario
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        // Crear el arreglo con datos generados a partir de una serie
        int[] arreglo1 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1[i] = i * 2; // Ejemplo de serie: múltiplos de 2
        }

        // Crear el segundo arreglo con los datos invertidos
        int[] arreglo2 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo2[i] = arreglo1[n - 1 - i];
        }

        // 2Imprimir ambos arreglos
        System.out.println("Arreglo original:");
        for (int i : arreglo1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Arreglo invertido:");
        for (int i : arreglo2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}