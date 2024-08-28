import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número (1, 2, 3, 4, 6, 12): ");
        int numero = scanner.nextInt();

        String periodo = "";

        switch (numero) {
            case 1:
            case 2:
            case 3:
                periodo = "bimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
            case 12:
                periodo = "anual";
                break;
            default:
                System.out.println("Número inválido.");
                return;
        }

        System.out.println("Número: " + numero);
        System.out.println("Periodo: " + periodo);
    }
}