import java.util.ArrayList;
import java.util.List;

// Business Entity
class Student {

    public Student(int id, String name) {
    }
}

class Grade {
    int studentId;
    String subject;
    double score;

    public Grade(int studentId, String subject, double score) {
        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
    }
}

// DAO Interface
interface IGradeDAO {
    void addGrade(Grade grade);
    List<Grade> getGradesByStudent(int studentId);
    // ... other CRUD methods (update, delete, etc.)
}


// DAO Implementation
class GradeDAO implements IGradeDAO {
    private final List<Grade> grades = new ArrayList<>();

    @Override
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    @Override
    public List<Grade> getGradesByStudent(int studentId) {
        List<Grade> studentGrades = new ArrayList<>();
        for (Grade grade : grades) {
            if (grade.studentId == studentId) {
                studentGrades.add(grade);
            }
        }
        return studentGrades;
    }

    // ... other CRUD methods implementation
}



