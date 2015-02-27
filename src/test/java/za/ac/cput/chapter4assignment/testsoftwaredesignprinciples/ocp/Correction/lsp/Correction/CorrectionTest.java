package za.ac.cput.chapter4assignment.testsoftwaredesignprinciples.ocp.Correction.lsp.Correction;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.lsp.violation.correction.Circle;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.lsp.violation.correction.Rectangle;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.lsp.violation.correction.Shape;

/**
 * Created by student on 2015/02/27.
 */
public class CorrectionTest {
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
    public void testCorrection() throws Exception {

        Assert.assertTrue(0 == s.area());
        Assert.assertTrue(0 == s2.area());

    }
}
