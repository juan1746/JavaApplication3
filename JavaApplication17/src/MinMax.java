import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        // Scanner para leer los números
        Scanner scanner = new Scanner(System.in);

        // Solicitar los valores de a y b
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        // Calcular el menor entre a y b
        double menor = Math.min(a, b);

        // Calcular el mayor entre a y b
        double mayor = Math.max(a, b);

        // Mostrar los resultados
        System.out.printf("El menor entre %.2f y %.2f es: %.2f\n", a, b, menor);
        System.out.printf("El mayor entre %.2f y %.2f es: %.2f\n", a, b, mayor);
    }
}
