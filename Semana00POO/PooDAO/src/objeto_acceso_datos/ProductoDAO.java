// objeto_acceso_datos/ProductoDAO.java
package objeto_acceso_datos;

import entidad_negocio.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements IBaseDAO<Producto> {
    private final Connection conexion;

    public ProductoDAO(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void crear(Producto producto) {
        String sql = "INSERT INTO productos (nombre, precio) VALUES (?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, producto.getNombre());
            statement.setDouble(2, producto.getPrecio());
            statement.executeUpdate();

            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    producto.setId(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al crear producto: " + e.getMessage());
        }
    }

    @Override
    public Producto leer(int id) {
        String sql = "SELECT * FROM productos WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Producto(resultSet.getInt("id"), resultSet.getString("nombre"), resultSet.getDouble("precio"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al leer producto: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void actualizar(Producto producto) {
        String sql = "UPDATE productos SET nombre = ?, precio = ? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, producto.getNombre());
            statement.setDouble(2, producto.getPrecio());
            statement.setInt(3, producto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al actualizar producto: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM productos WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar producto: " + e.getMessage());
        }
    }

    // Example of an additional method to get all products
    public List<Producto> obtenerTodos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                productos.add(new Producto(resultSet.getInt("id"), resultSet.getString("nombre"), resultSet.getDouble("precio")));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener todos los productos: " + e.getMessage());
        }
        return productos;
    }
}