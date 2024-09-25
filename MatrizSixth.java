package Matriz;
import java.util.Random;
import java.util.Scanner;

public class MatrizSixth {
    private static int[][] matriz;
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (n): ");
        n = sc.nextInt();
        matriz = new int[n][n];

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Llenar toda la matriz con números pedidos al usuario");
            System.out.println("2. Llenar toda la matriz con números aleatorios");
            System.out.println("3. Imprimir la matriz");
            System.out.println("4. Resultado de la suma de una fila");
            System.out.println("5. Resultado de la suma de una columna");
            System.out.println("6. Imprimir la diagonal principal");
            System.out.println("7. Resultado de la suma de la diagonal principal");
            System.out.println("8. Suma de todos los valores de la matriz");
            System.out.println("9. Valor promedio de todos los valores de la matriz");
            System.out.println("10. Encontrar el valor máximo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    llenarMatrizUsuario(sc);
                    break;
                case 2:
                    llenarMatrizAleatoria();
                    break;
                case 3:
                    imprimirMatriz();
                    break;
                case 4:
                    sumaFila(sc);
                    break;
                case 5:
                    sumaColumna(sc);
                    break;
                case 6:
                    imprimirDiagonalPrincipal();
                    break;
                case 7:
                    sumaDiagonalPrincipal();
                    break;
                case 8:
                    sumaTotal();
                    break;
                case 9:
                    promedioTotal();
                    break;
                case 10:
                    encontrarMaximo();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void llenarMatrizUsuario(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    private static void llenarMatrizAleatoria() {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(100); // Números aleatorios entre 0 y 99
            }
        }
    }

    private static void imprimirMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void sumaFila(Scanner sc) {
        System.out.print("Ingrese el número de la fila (0 a " + (n-1) + "): ");
        int j = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[j][i];
        }
        System.out.println("Suma de la fila " + j + ": " + suma);
    }

    private static void sumaColumna(Scanner sc) {
        System.out.print("Ingrese el número de la columna (0 a " + (n-1) + "): ");
        int i = sc.nextInt();
        int suma = 0;
        for (int j = 0; j < n; j++) {
            suma += matriz[j][i];
        }
        System.out.println("Suma de la columna " + i + ": " + suma);
    }

    private static void imprimirDiagonalPrincipal() {
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    private static void sumaDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
        }
        System.out.println("Suma de la diagonal principal: " + suma);
    }

    private static void sumaTotal() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("Suma total de la matriz: " + suma);
    }

    private static void promedioTotal() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma += matriz[i][j];
            }
        }
        double promedio = (double) suma / (n * n);
        System.out.println("Promedio de los valores de la matriz: " + promedio);
    }

    private static void encontrarMaximo() {
        int max = matriz[0][0];
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("Valor máximo: " + max + " en la posición [" + maxI + "][" + maxJ + "]");
    }
}