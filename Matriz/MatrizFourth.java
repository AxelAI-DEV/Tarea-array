package Matriz;
import java.util.Random;
import java.util.Scanner;

public class MatrizFourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = sc.nextInt();

        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];

        // Llenar matriz1 con valores aleatorios del 0 al 99
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = rand.nextInt(100);
            }
        }

        // Realizar la transposición de matriz1 en matriz2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }

        // Imprimir la diagonal de matriz2
        System.out.println("Diagonal de la matriz2:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz2[i][i] + " ");
        }
    }
}