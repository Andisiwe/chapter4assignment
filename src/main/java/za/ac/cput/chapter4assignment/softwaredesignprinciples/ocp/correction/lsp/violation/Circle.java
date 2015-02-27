package za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.lsp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class Circle implements Shape {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }

    @Override
    public double circumference() {
        return 3.14 * 2* radius;
    }
}
