// objeto_acceso_datos/ConexionBaseDatos.java
package objeto_acceso_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    public static Connection obtenerConexion() {
        try {
            // Load the JDBC driver (replace with your database driver)
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL Connector/J
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tu_base_de_datos", // Replace with your database URL
                    "tu_usuario", // Replace with your database username
                    "tu_contraseña"); // Replace with your database password
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Error connecting to the database: " + e.getMessage());
        }
    }
}