import java.util.Random;

public class ejercicio4 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[3][3];
        int totalVentas = 0;
        double promedioVentas = 0;

        // Generación de ventas aleatorias
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = random.nextInt(10000 - 1000 + 1) + 1000; // Genera número aleatorio entre 1000 y 10000
                totalVentas += ventas[i][j];
            }
        }

        // Cálculo del promedio de ventas
        promedioVentas = (double) totalVentas / (3 * 3);

        // Visualización del total y promedio de ventas
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
    }
}
