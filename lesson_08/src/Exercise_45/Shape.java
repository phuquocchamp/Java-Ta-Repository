package Exercise_45;

public class Shape {
    private String color = "red";
    private boolean filled = true;


    public Shape (){

    }

    public Shape (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Exercise_45.Shape[" + "color=" + color + ',' + ", filled=" + filled + ']';
    }
}