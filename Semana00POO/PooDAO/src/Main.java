import dao.*;
import entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "your_user", "your_password")) {
            IStudentDAO studentDAO = new StudentDAOImpl(conn);
            IGradeDAO gradeDAO = new GradeDAOImpl(conn);

            Student student = new Student(0, "Juan Pérez", "juan@example.com");
            studentDAO.add(student);

            Grade grade = new Grade(0, 1, "Matemáticas", 18.5);
            gradeDAO.add(grade);

            System.out.println("Estudiante y nota agregados correctamente.");

        } catch (SQLException e) {
            System.err.println("Error de base de datos: " + e.getMessage());
        }
    }
}