package Exersice_65;

import java.text.DecimalFormat;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }
    DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "ResizableCircle[" +super.toString() + "]\n" +
                "Area = " + decimalFormat.format(getArea()) +
                "\nPerimater = " +decimalFormat.format(getPerimeter());
    }

    @Override
    public void resize(double percent) {
        super.setRadius(radius*percent/100);
    }
}
