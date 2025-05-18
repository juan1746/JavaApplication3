// entidad_negocio/Producto.java
package entidad_negocio;

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto() {} // Constructor vacío (importante para frameworks como Hibernate)

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre='" + nombre + '\'' + ", precio=" + precio + '}';
    }
}