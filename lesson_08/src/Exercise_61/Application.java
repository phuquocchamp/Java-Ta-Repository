package Exercise_61;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Application {

    Scanner sc = new Scanner(System.in);

    public static double enterValue(){

        Scanner sc = new Scanner(System.in);
        double value = Integer.parseInt(sc.nextLine());
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("Menu Of Shape");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("Other number to exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            DecimalFormat df = new DecimalFormat("#.00");
            switch (choice){
                case 1:{
                    System.out.print("Enter radius: ");
                    Circle a = new Circle();
                    a.setRadius(enterValue());
                    System.out.println(a);
                    System.out.println("Area: " +df.format(a.getArea()) + "\nPerimeter: " + df.format(a.getPerimeter()));
                    break;
                }
                case 2:{
                    Rectangle a = new Rectangle();
                    System.out.print("Enter length: ");
                    a.setLength(enterValue());
                    System.out.print("Enter width: ");
                    a.setWidth(enterValue());
                    System.out.println(a);
                    System.out.println("Area: " +df.format(a.getArea()) + "\nPerimeter: " + df.format(a.getPerimeter()));
                    break;
                }
                case 3:{
                    Square a = new Square();
                    System.out.print("Enter side: ");
                    a.setSide(enterValue());
                    System.out.println(a);
                    System.out.println("Area: " +df.format(a.getArea()) + "\nPerimeter: " + df.format(a.getPerimeter()));
                    break;
                }
                default:{
                    System.out.println("Bye!!!");
                    check = false;
                    break;
                }

            }

        }
    }
}
