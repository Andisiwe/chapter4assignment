package za.ac.cput.chapter4assignment.testsoftwaredesignprinciples.ocp.Correction.srp.violation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.srp.Violation.Employee;

/**
 * Created by student on 2015/02/26.
 */
public class violationTest {
    Employee emp;

    @Before
    public void setUp() throws Exception {
        emp = new Employee();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testEmployee() throws Exception {
        emp.setLname("Peter");
        emp.setSname("Yamkela");
        emp.setAge(22);
        emp.setHourIn(8);
        emp.setHourOut(16);

        Assert.assertTrue(emp.getLname().equals("Peter"));
        Assert.assertEquals(8, emp.calcHoursWorked());


    }
}
