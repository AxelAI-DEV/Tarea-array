package Array;
import java.util.Scanner;

public class ArrayFourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el tamaño del arreglo por el usuario
        System.out.print("Ingrese el tamaño del arreglo, este debe ser un numero par: ");
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println("El número ingresado no es par.");
            return;
        } else {
            // Crear el arreglo con tamaño n
            int[] arreglo1 = new int[n];
            for (int i = 0; i < n; i++) {
                arreglo1[i] = i * 2; // Ejemplo de serie: múltiplos de 2
            }

            // Crear el segundo arreglo con los promedios de cada par de elementos
            float[] arreglo2 = new float[n / 2];
            for (int i = 0; i < n; i+=2) {
                arreglo2[i/2] = (arreglo1[i] + arreglo1[i + 1]) / 2.0f;
            }

            // Imprimir ambos arreglos
            System.out.println("Arreglo original:");
            for (int i : arreglo1) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.println("Arreglo promediado:");
            for (float i : arreglo2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}