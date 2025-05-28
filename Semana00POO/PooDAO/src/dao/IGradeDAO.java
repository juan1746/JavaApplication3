package dao;

import entity.Grade;
import java.util.List;

public interface IGradeDAO extends IBaseDAO<Grade> {
    List<Grade> getGradesByStudentId(int studentId);
}