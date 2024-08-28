package Exercise_61;

public class Circle extends Shape {


    protected double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius*radius*3.14;
    }

    @Override
    double getPerimeter() {
        return radius*2*3.14;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +"], radius=" +getRadius();
    }
}
