
import java.util.List;


public class Main {
    public static void main(String[] args) {
        GradeDAO gradeDAO = new GradeDAO();

        // Add some grades
        gradeDAO.addGrade(new Grade(1, "Matemáticas", 8.5));
        gradeDAO.addGrade(new Grade(1, "Ciencias", 9.2));
        gradeDAO.addGrade(new Grade(2, "Historia", 7.0));

        // Retrieve grades for student with ID 1
        List<Grade> studentGrades = gradeDAO.getGradesByStudent(1);

        System.out.println("Notas para el estudiante con ID 1:");
        for (Grade grade : studentGrades) {
            System.out.println("Materia: " + grade.subject + ", Calificación: " + grade.score);
        }
    }
}