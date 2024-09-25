package Matriz;
import java.util.Random;
import java.util.Scanner;

public class MatrizThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese el número de filas (m): ");
        int m = sc.nextInt();

        System.out.print("Ingrese el número de columnas (n): ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        // Llenar la matriz con números aleatorios del 0 al 10
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(11); // Genera un número aleatorio entre 0 y 10
            }
        }

        // Mostrar la matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}