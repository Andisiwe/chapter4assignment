package za.ac.cput.chapter4assignment.testsoftwaredesignprinciples.ocp.Correction.srp.violation.Correction;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.srp.Violation.Correction.ClockingSystem;

/**
 * Created by student on 2015/02/27.
 */
public class TestClockingSystem {
    ClockingSystem clock;

    @Before
    public void setUp() throws Exception {
        clock = new ClockingSystem();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testClockingSystem() throws Exception {
        clock.setHourIn(8);
        clock.setHourOut(16);

        Assert.assertEquals(8, clock.calcHoursWorked());


    }
}
