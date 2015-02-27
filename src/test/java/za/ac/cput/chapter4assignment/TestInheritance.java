package za.ac.cput.chapter4assignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.objectorientedprinciples.inheritance.Mosquito;

/**
 * Created by student on 2015/02/27.
 */
public class TestInheritance {
    private Mosquito mos;

    @Before
    public void setUp() throws Exception {
        mos = new Mosquito();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testMosquito() throws Exception {
        Assert.assertTrue("whine".equals(mos.makeSound()));

    }
}
