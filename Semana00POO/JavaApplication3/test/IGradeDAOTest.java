/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ramon
 */
public class IGradeDAOTest {
    
    public IGradeDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addGrade method, of class IGradeDAO.
     */
    @Test
    public void testAddGrade() {
        System.out.println("addGrade");
        Grade grade = null;
        IGradeDAO instance = new IGradeDAOImpl();
        instance.addGrade(grade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGradesByStudent method, of class IGradeDAO.
     */
    @Test
    public void testGetGradesByStudent() {
        System.out.println("getGradesByStudent");
        int studentId = 0;
        IGradeDAO instance = new IGradeDAOImpl();
        List<Grade> expResult = null;
        List<Grade> result = instance.getGradesByStudent(studentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IGradeDAOImpl implements IGradeDAO {

        public void addGrade(Grade grade) {
        }

        public List<Grade> getGradesByStudent(int studentId) {
            return null;
        }
    }
    
}
