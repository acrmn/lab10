import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.GradeEvaluator;
import com.example.Student;

public class GradeEvaluatorTest {

        @Mock
        private Student mockStudent;

        private GradeEvaluator gradeEvaluator;

        @BeforeEach
        public void setUp() {
            MockitoAnnotations.openMocks(this);
            gradeEvaluator = new GradeEvaluator();
        }

        @Test
        public void testEvaluatePerformance_Passed() {
            when(mockStudent.calculateAverage()).thenReturn(75);
            gradeEvaluator.evaluatePerformance(mockStudent);
            verify(mockStudent).calculateAverage();
        }

        @Test
        public void testEvaluatePerformance_Failed() {
            when(mockStudent.calculateAverage()).thenReturn(55);
            gradeEvaluator.evaluatePerformance(mockStudent);
            verify(mockStudent).calculateAverage();
        }

        @Test
        public void testIsEligibleForHonors_True() {
            when(mockStudent.calculateAverage()).thenReturn(95);
            assertTrue(gradeEvaluator.isEligibleForHonors(mockStudent));
            verify(mockStudent).calculateAverage();
        }

        @Test
        public void testIsEligibleForHonors_False() {
            when(mockStudent.calculateAverage()).thenReturn(85);
            assertFalse(gradeEvaluator.isEligibleForHonors(mockStudent));
            verify(mockStudent).calculateAverage();
        }
}
