package za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.lsp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class Rectangle implements Shape {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double circumference() {
        return Double.parseDouble("Rectangle does not have circumference, it has a perimeter");
    }
}
