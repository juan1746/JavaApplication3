import java.util.Scanner;

public class Producto {
    private String nombre;
    private double precio;
    private double descuento;

    public Producto(String nombre, double precio, double descuento) {
        // Input validation: Check for invalid values
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio del producto debe ser mayor que cero.");
        }
        if (descuento < 0) {
            throw new IllegalArgumentException("El descuento del producto no puede ser negativo.");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public double calcularGanancia() {
        return precio - descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numProductos;

        // Get the number of products from the user with input validation.
        do {
            System.out.print("Ingrese el número de productos: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next();
            }
            numProductos = scanner.nextInt();
            if (numProductos <= 0) {
                System.out.println("El número de productos debe ser mayor que cero.");
            }
        } while (numProductos <= 0);


        Producto[] productos = new Producto[numProductos];

        // Get product details from the user for each product.  Handles potential exceptions.
        for (int i = 0; i < numProductos; i++) {
            System.out.println("\nIngrese los detalles del producto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            scanner.nextLine(); // Consume newline left by nextInt()
            String nombre = scanner.nextLine();
            double precio, descuento;
            do {
                System.out.print("Precio: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número.");
                    scanner.next();
                }
                precio = scanner.nextDouble();
                if (precio <=0){
                    System.out.println("El precio debe ser mayor que cero.");
                }
            } while (precio <=0);

            do {
                System.out.print("Descuento: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número.");
                    scanner.next();
                }
                descuento = scanner.nextDouble();
                if (descuento < 0){
                    System.out.println("El descuento no puede ser negativo.");
                }
            } while (descuento < 0);

            try {
                productos[i] = new Producto(nombre, precio, descuento);
            } catch (IllegalArgumentException e) {
                System.err.println("Error al crear el producto: " + e.getMessage());
            }
        }

        // Display product information and calculate total profit.
        System.out.println("\nResumen de Productos:");
        double totalGanancia = 0;
        for (var producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() +
                    ", Precio: " + producto.getPrecio() +
                    ", Descuento: " + producto.getDescuento() +
                    ", Ganancia: " + producto.calcularGanancia());
            totalGanancia += producto.calcularGanancia();
        }

        System.out.println("\nGanancia total: " + totalGanancia);
        scanner.close();
    }
}
  
