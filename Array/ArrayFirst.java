package Array;

import java.util.Scanner;

public class ArrayFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el tamaño del arreglo por el usuario
        System.out.print("Ingrese el tamaño del arreglo: ");
        int x = scanner.nextInt();

        // Definir un nuevo arreglo de enteros llamado arr_int, de tamaño x
        int[] arr_int = new int[x];

        // Pedir al usuario tantos números enteros como el tamaño del arreglo arr_int creado
        for (int i = 0; i < x; i++) {
            System.out.print("Ingrese un número entero: ");
            int num = scanner.nextInt();
            // Asignar el doble de cada uno de esos datos recibidos a las posiciones del arreglo arr_int
            arr_int[i] = num * 2;
        }

        // Realizar un ciclo para imprimir todos las variables del arreglo multiplicados por tres por pantalla
        System.out.println("Valores del arreglo multiplicados por tres:");
        for (int i = 0; i < x; i++) {
            System.out.println(arr_int[i] * 3);
        }

        scanner.close();
    }
}