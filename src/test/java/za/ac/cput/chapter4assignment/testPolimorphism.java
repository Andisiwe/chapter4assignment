package za.ac.cput.chapter4assignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter4assignment.objectorientedprinciples.polimorphism.PostGrad;

/**
 * Created by student on 2015/02/27.
 */
public class testPolimorphism {
    private PostGrad p;

    @Before
    public void setUp() throws Exception {
        p = new PostGrad();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testPolimophism() throws Exception {
        Assert.assertEquals(210040475, p.getStudNum());

    }
}
