package Exersice_65;

public class Circle implements GeometricObject {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius * 3.14 * 2;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle[ radius=" + radius + ']';
    }



}
