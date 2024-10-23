import java.util.Random;

public class ejercicio3 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[4][4];
        int ventaMayor = 0;
        int ventaMenor = 5000;

        // Registro de ventas aleatorias
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = random.nextInt(5000 - 10 + 1) + 10; // Generar número aleatorio entre 10 y 5000
                // Actualizar venta mayor y menor
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
        }

        // Visualización de la venta mayor y menor
        System.out.println("Venta mayor: " + ventaMayor);
        System.out.println("Venta menor: " + ventaMenor);
    }
}
