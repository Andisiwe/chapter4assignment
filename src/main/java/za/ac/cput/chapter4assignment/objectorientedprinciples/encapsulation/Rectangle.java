package za.ac.cput.chapter4assignment.objectorientedprinciples.encapsulation;

/**
 * Created by student on 2015/02/26.
 */
public class Rectangle {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int calcArea(){
        return length * width;
    }
}
