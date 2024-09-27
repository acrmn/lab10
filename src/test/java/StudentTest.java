import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Student;


    public class StudentTest {
        private Student student;

        @BeforeEach
        public void setUp() {
            int[] grades = {85, 90, 78};
            student = new Student("John Doe", 12345, grades);
        }

        @Test
        public void testGetName() {
            assertEquals("John Doe", student.getName());
        }

        @Test
        public void testGetStudentID() {
            assertEquals(12345, student.getStudentID());
        }

        @Test
        public void testGetGrades() {
            int[] expectedGrades = {85, 90, 78};
            assertArrayEquals(expectedGrades, student.getGrades());
        }

        @Test
        public void testSetName() {
            student.setName("Jane Doe");
            assertEquals("Jane Doe", student.getName());
        }

        @Test
        public void testSetStudentID() {
            student.setStudentID(54321);
            assertEquals(54321, student.getStudentID());
        }

        @Test
        public void testSetGrades() {
            int[] newGrades = {88, 92, 80};
            student.setGrades(newGrades);
            assertArrayEquals(newGrades, student.getGrades());
        }

        @Test
        public void testAddGrade() {
            student.addGrade(95);
            int[] expectedGrades = {85, 90, 78, 95};
            assertArrayEquals(expectedGrades, student.getGrades());
        }

        @Test
        public void testCalculateAverage() {
            assertEquals(84, student.calculateAverage());
        }

        @Test
        public void testGetGradeLetter() {
            assertEquals('B', student.getGradeLetter());
        }

        @Test
        public void testCalculateAverageWithNoGrades() {
            Student emptyStudent = new Student("Empty Student", 67890, new int[]{});
            assertThrows(ArithmeticException.class, emptyStudent::calculateAverage);
        }

        @Test
        public void testGetGradeLetterWithNoGrades() {
            Student emptyStudent = new Student("Empty Student", 67890, new int[]{});
            assertThrows(ArithmeticException.class, emptyStudent::getGradeLetter);
        }
    }

