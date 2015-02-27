package za.ac.cput.chapter4assignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.objectorientedprinciples.encapsulation.Rectangle;

/**
 * Created by student on 2015/02/26.
 */
public class TestEncapsulation {
    Rectangle rec;

    @Before
    public void setUp() throws Exception {
        rec = new Rectangle();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testRectangle() throws Exception {
        rec.setLength(10);
        rec.setWidth(5);

        System.out.println("Length: " + rec.getLength());
        System.out.println("Width: " +rec.getWidth());
        System.out.println("Area: " +rec.calcArea());

        Assert.assertEquals(50, rec.calcArea());

    }
}
