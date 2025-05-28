package dao;

import entity.Grade;
import java.sql.*;
import java.util.*;

public class GradeDAOImpl implements IGradeDAO {
    private final Connection conn;

    public GradeDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void add(Grade grade) throws SQLException {
        String sql = "INSERT INTO grades (student_id, course_name, grade) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, grade.getStudentId());
            ps.setString(2, grade.getCourseName());
            ps.setDouble(3, grade.getGradeValue());
            ps.executeUpdate();
        }
    }

    @Override
    public Grade getById(int id) throws SQLException {
        String sql = "SELECT * FROM grades WHERE grade_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Grade(rs.getInt("grade_id"), rs.getInt("student_id"), rs.getString("course_name"), rs.getDouble("grade"));
            }
        }
        return null;
    }

    @Override
    public List<Grade> getAll() throws SQLException {
        List<Grade> grades = new ArrayList<>();
        String sql = "SELECT * FROM grades";
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                grades.add(new Grade(rs.getInt("grade_id"), rs.getInt("student_id"), rs.getString("course_name"), rs.getDouble("grade")));
            }
        }
        return grades;
    }

    @Override
    public void update(Grade grade) throws SQLException {
        String sql = "UPDATE grades SET student_id = ?, course_name = ?, grade = ? WHERE grade_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, grade.getStudentId());
            ps.setString(2, grade.getCourseName());
            ps.setDouble(3, grade.getGradeValue());
            ps.setInt(4, grade.getId());
            ps.executeUpdate();
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM grades WHERE grade_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public List<Grade> getGradesByStudentId(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}