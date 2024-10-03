import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de años: ");
        int años = scanner.nextInt();

        for (int i = 1; i <= años; i++) {
            System.out.println("Año " + i + ":");
            for (int j = 1; j <= 12; j++) {
                System.out.println("Mes " + j);
            }
        }
    }
}