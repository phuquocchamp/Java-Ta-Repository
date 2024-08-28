package Exercise_61;

public class Rectangle extends Shape{

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return getLength() * getWidth();
    }

    @Override
    double getPerimeter() {
        return 2*(getLength() + getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width =" +getWidth() + "length" +getLength();
    }
}
