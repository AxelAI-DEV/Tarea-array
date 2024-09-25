package Matriz;
import java.util.Scanner;

public class MatrizFifth {
    private static int[][] matriz;
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes (n): ");
        n = sc.nextInt();
        matriz = new int[4][n];

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Leer datos de un estudiante");
            System.out.println("2. Buscar estudiante por ID");
            System.out.println("3. Contar estudiantes en un rango de edad");
            System.out.println("4. Imprimir todos los estudiantes");
            System.out.println("5. Imprimir estudiantes de un año determinado");
            System.out.println("6. Imprimir el número promedio de materias");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    leerDatosEstudiante(sc);
                    break;
                case 2:
                    buscarEstudiantePorID(sc);
                    break;
                case 3:
                    contarEstudiantesPorRangoEdad(sc);
                    break;
                case 4:
                    imprimirTodosEstudiantes();
                    break;
                case 5:
                    imprimirEstudiantesPorAno(sc);
                    break;
                case 6:
                    imprimirPromedioMaterias();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void leerDatosEstudiante(Scanner sc) {
        System.out.print("Ingrese la posición (i) del estudiante: ");
        int i = sc.nextInt();
        if (i < 0 || i >= n) {
            System.out.println("Posición no válida.");
            return;
        }

        System.out.print("Ingrese el ID del estudiante: ");
        matriz[0][i] = sc.nextInt();
        System.out.print("Ingrese la edad del estudiante: ");
        matriz[1][i] = sc.nextInt();
        System.out.print("Ingrese el año de nacimiento del estudiante: ");
        matriz[2][i] = sc.nextInt();
        System.out.print("Ingrese el número de materias del estudiante: ");
        matriz[3][i] = sc.nextInt();
    }

    private static void buscarEstudiantePorID(Scanner sc) {
        System.out.print("Ingrese el ID del estudiante: ");
        int id = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (matriz[0][i] == id) {
                System.out.println("ID: " + matriz[0][i] + ", Edad: " + matriz[1][i] + ", Año de Nacimiento: " + matriz[2][i] + ", Número de Materias: " + matriz[3][i]);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    private static void contarEstudiantesPorRangoEdad(Scanner sc) {
        System.out.print("Ingrese la edad mínima: ");
        int edadMin = sc.nextInt();
        System.out.print("Ingrese la edad máxima: ");
        int edadMax = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (matriz[1][i] >= edadMin && matriz[1][i] <= edadMax) {
                contador++;
            }
        }
        System.out.println("Número de estudiantes en el rango de edad: " + contador);
    }

    private static void imprimirTodosEstudiantes() {
        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + matriz[0][i] + ", Edad: " + matriz[1][i] + ", Año de Nacimiento: " + matriz[2][i] + ", Número de Materias: " + matriz[3][i]);
        }
    }

    private static void imprimirEstudiantesPorAno(Scanner sc) {
        System.out.print("Ingrese el año de nacimiento: ");
        int ano = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (matriz[2][i] == ano) {
                System.out.println("ID: " + matriz[0][i] + ", Edad: " + matriz[1][i] + ", Año de Nacimiento: " + matriz[2][i] + ", Número de Materias: " + matriz[3][i]);
            }
        }
    }

    private static void imprimirPromedioMaterias() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[3][i];
        }
        double promedio = (double) suma / n;
        System.out.println("Número promedio de materias: " + promedio);
    }
}