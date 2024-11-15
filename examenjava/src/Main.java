import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alumnos = new String[20]; // Máximo 20 alumnos
        char[][] asistencia = new char[20][10]; // Matriz para asistencia (P/A)
        int numAlumnos = 0; // Número de alumnos registrados
        int numDias = 0; // Número de días a registrar

