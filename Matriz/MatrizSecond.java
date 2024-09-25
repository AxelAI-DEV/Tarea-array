package Matriz;
import java.util.Scanner;

public class MatrizSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int contador = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = contador++;
            }
        }

        // Mostrar la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}