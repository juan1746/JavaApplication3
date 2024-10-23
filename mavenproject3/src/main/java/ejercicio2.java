import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] compras = new int[4][4];
        int totalCompras = 0;
        double promedioCompras = 0;

        // Registro de compras
        System.out.println("Ingrese las compras para cada posición de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Compra [" + i + "][" + j + "]: ");
                compras[i][j] = scanner.nextInt();
                totalCompras += compras[i][j];
            }
        }

        // Cálculo del promedio de compras
        promedioCompras = (double) totalCompras / (4 * 4);

        // Visualización del total y promedio de compras
        System.out.println("\nTotal de compras: " + totalCompras);
        System.out.println("Promedio de compras: " + promedioCompras);
    }
}
