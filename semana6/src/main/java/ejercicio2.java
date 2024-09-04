import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        
        int contador = 0;
        
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }
        
        System.out.println("El número ingresado tiene " + contador + " dígitos.");
    }
}