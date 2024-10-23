import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ventas = new int[4][4];
        int totalVentas = 0;

        // Registro de ventas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese la venta para la posición [" + i + "][" + j + "]: ");
                ventas[i][j] = scanner.nextInt();
                totalVentas += ventas[i][j];
            }
        }

        // Visualización del total de ventas
        System.out.println("El total de las ventas es: " + totalVentas);
    }
}
