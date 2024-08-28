package Exercise_45;

public class Retangle extends Shape {


    private double width = 1.0;
    private double length = 1.0;


    public Retangle() {
    }

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retangle(String color, boolean filled, double width, double length) {
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

    public double getArea(){
        return width * length;
    }

    public double getPerimeter (){
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[ Exercise_45.Shape[ color= " + super.getColor() +"[ filled = " + super.isFilled() + "], width= " + width
                +"] length = " + length +"]]";
    }


}
