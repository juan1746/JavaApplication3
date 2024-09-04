import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número límite: ");
        int limite = sc.nextInt();
        
        int suma = 0;
        int i = 1;
        
        while (i <= limite) {
            if (i % 2 == 0) {
                suma += i;
            }
            i++;
        }
        
        System.out.println("La suma de los números pares hasta " + limite + " es: " + suma);
    }
}