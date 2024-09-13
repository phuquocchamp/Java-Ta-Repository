package Exercise_65;

import java.text.DecimalFormat;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }
    DecimalFormat decimalFormat = new DecimalFormat( "#.##" );

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
