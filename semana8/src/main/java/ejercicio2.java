import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidad = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números es: " + suma);
    }
}
