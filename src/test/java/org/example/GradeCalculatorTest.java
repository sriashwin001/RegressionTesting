
package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    GradeCalculator calculator = new GradeCalculator();

    @Test
    public void testGradeA() {
        assertEquals("A", calculator.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", calculator.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", calculator.calculateGrade(75));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", calculator.calculateGrade(65));
    }
}
