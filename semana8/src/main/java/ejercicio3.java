import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();

        int hombres = 0;
        int mujeres = 0;

        for (int i = 1; i <= cantidadPersonas; i++) {
            System.out.print("Ingrese el sexo de la persona " + i + " (M/F): ");
            String sexo = scanner.next();

            if (sexo.equalsIgnoreCase("M")) {
                hombres++;
            } else if (sexo.equalsIgnoreCase("F")) {
                mujeres++;
            }
        }

        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
}