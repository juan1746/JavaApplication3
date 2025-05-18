// principal/Principal.java
package principal;

import objeto_acceso_datos.ConexionBaseDatos;
import objeto_acceso_datos.ProductoDAO;
import entidad_negocio.Producto;
import java.sql.SQLException;

import java.util.List;

public class Principal {
    public static void main(String[] args) throws SQLException {
        try (java.sql.Connection connection = ConexionBaseDatos.obtenerConexion()) {
            ProductoDAO productoDAO = new ProductoDAO((java.sql.Connection) connection);

            // Create a product
            Producto nuevoProducto = new Producto(0, "Nuevo Producto", 19.99); // ID 0 if auto-incrementing
            productoDAO.crear(nuevoProducto);
            System.out.println("Producto creado: " + nuevoProducto);

            // Read a product
            Producto productoLeido = productoDAO.leer(nuevoProducto.getId());
            System.out.println("Producto leido: " + productoLeido);

            // Update a product
            productoLeido.setPrecio(24.99);
            productoDAO.actualizar(productoLeido);
            System.out.println("Producto actualizado: " + productoLeido);

            // Get all products
            List<Producto> todosProductos = productoDAO.obtenerTodos();
            System.out.println("Todos los productos: " + todosProductos);

            // Delete a product
            productoDAO.eliminar(nuevoProducto.getId());
            System.out.println("Producto eliminado");

        } catch (RuntimeException e) {
            System.err.println("Error in the application: " + e.getMessage());
        }
    }
}