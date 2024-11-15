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

