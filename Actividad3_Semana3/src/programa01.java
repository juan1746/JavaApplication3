import java.util.Scanner;

public class programa01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        
        if(numero >= 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        
        sc.close();
    }
}
