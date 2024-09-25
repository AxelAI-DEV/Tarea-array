package Matriz;
import java.util.Scanner;

public class MatrizCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el tamaño de las columnas: ");
        int c = sc.nextInt();

        System.out.print("Digite el tamaño de las filas: ");
        int f = sc.nextInt();

        int matriz[][] = new int[c][f];

        // Llenar la matriz
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print("Matriz columna[" + i + "] fila[" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar la matriz

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
