package za.ac.cput.chapter4assignment.testsoftwaredesignprinciples.ocp.Correction.srp.violation.Correction;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.srp.Violation.Correction.Employee;

/**
 * Created by student on 2015/02/26.
 */
public class TestEmployee {
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

        Assert.assertTrue(22 == emp.getAge());

    }
}
