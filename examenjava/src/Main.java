import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alumnos = new String[20]; // Nombres de alumnos
        char[][] asistencia = new char[20][10]; // Matriz de asistencia
        int numAlumnos = 0; // Número de alumnos
        int numDias = 0; // Número de días
        while (true) {
            // Menú principal
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Iniciar control de asistencia");
            System.out.println("2. Listar alumnos con menos del 80% de asistencia");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            if (opcion == 1) {
                // Opción 1: Iniciar control de asistencia
                System.out.print("Introduce el número de alumnos (máximo 20): ");
                numAlumnos = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                if (numAlumnos > 20 || numAlumnos <= 0) {
                    System.out.println("Número no válido. Debe ser entre 1 y 20.");
                    continue; // Volver al menú
                }
                System.out.print("Introduce el número de días (máximo 10): ");
                numDias = sc.nextInt();
                sc.nextLine();

                if (numDias > 10 || numDias <= 0) {
                    System.out.println("Número no válido. Debe ser entre 1 y 10.");
                    continue; // Volver al menú
                }

                System.out.println("Introduce los nombres de los alumnos:");
                for (int i = 0; i < numAlumnos; i++) {
                    System.out.print("Alumno " + (i + 1) + ": ");
                    alumnos[i] = sc.nextLine();
                }


