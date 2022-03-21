import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    @DisplayName("List size below 0")
    void checkListSize_below_0() {
        assertFalse(App.checkListSize(-1));
    }

    @Test
    @DisplayName("List size in range")
    void checkListSize_inRange() {
        assertTrue(App.checkListSize(60));
    }

    @Test
    @DisplayName("List size higher 60")
    void checkListSize_higher_60() {
        assertFalse(App.checkListSize(-1));
    }

    @Test
    @DisplayName("Grade not to round. Grade below 38")
    void gradeRoundable_grade_lower_38() {
        assertFalse(App.gradeRoundable(37));
    }

    @Test
    @DisplayName("Grade to round. Grade equals 38")
    void gradeRoundable_grade_equals_38() {
        assertTrue(App.gradeRoundable(38));
    }

    @Test
    @DisplayName("Grade not to round (grade=42)")
    void roundGrade_grade_equals_42() {
        assertEquals(42, App.roundGrade(42), "Rounding incorrect.");
    }

    @Test
    @DisplayName("Grade to round (grade=43)")
    void roundGrade_grade_equals_43() {
        assertEquals(45, App.roundGrade(43), "Rounding incorrect.");
    }

    @Test
    @DisplayName("Grade to round (grade=44")
    void roundGrade_grade_equals_44() {
        assertEquals(45, App.roundGrade(44), "Rounding incorrect.");
    }

    @Test
    @DisplayName("Grade not to round (grade=45")
    void roundGrade_grade_equals_45() {
        assertEquals(45, App.roundGrade(45), "Rounding incorrect.");
    }

    @Test
    @DisplayName("List contains null element")
    void containsNullElement_with_null_element() {
        List<Integer> grades = Arrays.asList(4,null,50);
        assertTrue(App.containsNullElement(grades));
    }

    @Test
    void containsNullElement_without_null_element() {
        List<Integer> grades = Arrays.asList(4,87,50);
        assertFalse(App.containsNullElement(grades));
    }

    @Test
    @DisplayName("Correct building of final list")
    void finalGrades() {
        List<Integer> grades = Arrays.asList(4,73,67,38,33);
        List<Integer> expected = Arrays.asList(75,67,40,33);
        List<Integer> actual = App.finalGrades(grades);
        assertEquals(expected, actual, "Test Failed");
    }

}