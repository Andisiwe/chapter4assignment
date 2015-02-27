package za.ac.cput.chapter4assignment.objectorientedprinciples.polimorphism;

/**
 * Created by student on 2015/02/27.
 */
public class PostGrad extends UnderGrad {
    public int getStudNum(){
        return super.studentNo();
    }
}
