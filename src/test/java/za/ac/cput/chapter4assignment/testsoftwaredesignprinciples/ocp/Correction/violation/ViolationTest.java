package za.ac.cput.chapter4assignment.testsoftwaredesignprinciples.ocp.Correction.violation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.ActualCalculator;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.Calculator;

/**
 * Created by student on 2015/02/26.
 */
public class ViolationTest {
    ActualCalculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new ActualCalculator();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testActualCalculator() throws Exception {
        calc.answer(new Calculator[]{});

    }
}
