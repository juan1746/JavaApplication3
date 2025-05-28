package dao;

import entity.Student;
import java.sql.*;
import java.util.*;

public class StudentDAOImpl implements IStudentDAO {
    private final Connection conn;

    public StudentDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void add(Student student) throws SQLException {
        String sql = "INSERT INTO students (student_name, student_email) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.executeUpdate();
        }
    }

    @Override
    public Student getById(int id) throws SQLException {
        String sql = "SELECT * FROM students WHERE student_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(rs.getInt("student_id"), rs.getString("student_name"), rs.getString("student_email"));
            }
        }
        return null;
    }

    @Override
    public List<Student> getAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                students.add(new Student(rs.getInt("student_id"), rs.getString("student_name"), rs.getString("student_email")));
            }
        }
        return students;
    }

    @Override
    public void update(Student student) throws SQLException {
        String sql = "UPDATE students SET student_name = ?, student_email = ? WHERE student_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setInt(3, student.getId());
            ps.executeUpdate();
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM students WHERE student_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}