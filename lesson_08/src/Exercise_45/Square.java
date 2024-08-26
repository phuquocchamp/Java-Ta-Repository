package Exercise_45;

public class Square extends Retangle {


    private double side = getWidth();


    public Square() {
    }

    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "Exercise_45.Retangle[ Exercise_45.Shape[ color= " + super.getColor() + "[ filled = " + super.isFilled() + "], side= " + side
                + "]] Area: " +getArea() +", Perimeter " +getPerimeter();
    }


}



