package za.ac.cput.chapter4assignment.testsoftwaredesignprinciples.ocp.Correction.dip.Correction;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.dip.Correction.IT3rdYearStudent;

/**
 * Created by student on 2015/02/27.
 */
public class CorrectionTest {
    IT3rdYearStudent stud;

    @Before
    public void setUp() throws Exception {
        stud = new IT3rdYearStudent();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCorrection() throws Exception {
        Assert.assertTrue("More work load".equals(stud.workLoad()));

    }
}
