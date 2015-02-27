package za.ac.cput.chapter4assignment.testsoftwaredesignprinciples.ocp.Correction.lsp.Correction.violation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.lsp.violation.Circle;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.lsp.violation.Rectangle;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.lsp.violation.Shape;

/**
 * Created by student on 2015/02/27.
 */
public class ViolationTest {
    private Shape s;
    private Shape s2;

    @Before
    public void setUp() throws Exception {
        s = new Rectangle();
        s2 = new Circle();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testViolation() throws Exception {
        Assert.assertTrue(0 == s.area());
        Assert.assertTrue(Double.parseDouble("Rectangle does not have circumference, it has perimeter") == s.circumference());
        Assert.assertTrue(0 == s2.circumference());
        Assert.assertTrue(0 == s2.area());

    }
}
