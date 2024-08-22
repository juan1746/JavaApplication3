import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Constante para la velocidad de la luz
        final double VELOCIDAD_LUZ = 299792458;

        // Scanner para leer el número de días
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de días: ");
        int dias = scanner.nextInt();

        // Cálculo de la distancia
        double segundos = dias * 24 * 60 * 60; // Segundos en N días
        double distancia = VELOCIDAD_LUZ * segundos; // Distancia en metros

        // Salida con formato
        System.out.printf("La distancia que recorre la luz en %d días es: %.2e metros\n", dias, distancia);
    }
}
