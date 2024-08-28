package Exercise_61;

public class Square extends Rectangle{
    protected double side = getWidth();

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super();
        side = this.side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }





    @Override
    public String toString() {
        return "Square[" +super.toString() +']';
    }
}
