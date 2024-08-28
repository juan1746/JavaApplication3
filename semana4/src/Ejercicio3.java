import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número (1-8): ");
        int numero = scanner.nextInt();

        String ingles = "";

        switch (numero) {
            case 1:
                ingles = "one";
                break;
            case 2:
                ingles = "two";
                break;
            case 3:
                ingles = "three";
                break;
            case 4:
                ingles = "four";
                break;
            case 5:
                ingles = "five";
                break;
            case 6:
                ingles = "six";
                break;
            case 7:
                ingles = "seven";
                break;
            case 8:
                ingles = "eight";
                break;
            default:
                System.out.println("Número inválido.");
                return;
        }

        System.out.println("Número: " + numero);
        System.out.println("Inglés: " + ingles);
    }
}