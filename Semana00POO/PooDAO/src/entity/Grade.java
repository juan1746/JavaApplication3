package entity;

public class Grade {
    private int id;
    private int studentId;
    private String courseName;
    private double gradeValue;

    public Grade() {}

    public Grade(int id, int studentId, String courseName, double gradeValue) {
        this.id = id;
        this.studentId = studentId;
        this.courseName = courseName;
        this.gradeValue = gradeValue;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public double getGradeValue() { return gradeValue; }
    public void setGradeValue(double gradeValue) { this.gradeValue = gradeValue; }
}