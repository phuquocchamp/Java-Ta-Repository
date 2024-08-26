package Exercise_45;

public class Circle extends Shape {
    private double radius = 1.0;


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }



    public Circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = radius * radius * 3.14;
        return area;
    }

    public double getPerimeter (){
        double perimeter = radius * 2 * 3.14;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Exercise_45.Circle[ Exercise_45.Shape[ " + super.getColor() +'[' + super.isFilled() + "]," + radius ;
    }
}
