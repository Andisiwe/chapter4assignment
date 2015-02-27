package za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.lsp.violation.correction;

/**
 * Created by student on 2015/02/27.
 */
public class Circle implements Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
