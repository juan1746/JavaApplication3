import java.util.Scanner;

public class Empleado {

    // Atributos de la clase Empleado
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    // Constructor de la clase Empleado
    public Empleado() {
        this.ingresoMensual = 0;
        this.otrosIngresos = 0;
        this.gastosMensuales = 0;
    }

    // Métodos para establecer los valores de los atributos
    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public void setGastosMensuales(double gastosMensuales) {
        this.gastosMensuales = gastosMensuales;
    }

    // Métodos para obtener los valores de los atributos
    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public double getGastosMensuales() {
        return gastosMensuales;
    }

    // Método para calcular el ahorro mensual
    public double calcularAhorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }

    // Método para calcular el ahorro semestral
    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }

    // Método para calcular el ahorro anual
    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado();

        // Solicitar al usuario los ingresos y gastos mensuales
        System.out.print("Ingrese el ingreso mensual: ");
        empleado.setIngresoMensual(scanner.nextDouble());

        System.out.print("Ingrese otros ingresos: ");
        empleado.setOtrosIngresos(scanner.nextDouble());

        System.out.print("Ingrese los gastos mensuales: ");
        empleado.setGastosMensuales(scanner.nextDouble());

        // Calcular y mostrar los ahorros
        System.out.println("Ahorro mensual: " + empleado.calcularAhorroMensual());
        System.out.println("Ahorro semestral: " + empleado.calcularAhorroSemestral());
        System.out.println("Ahorro anual: " + empleado.calcularAhorroAnual());
    }
}
