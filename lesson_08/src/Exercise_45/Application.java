package Exercise_45;



import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");

        int value;
        do {
            System.out.print("Choose option: ");
            value = sc.nextInt();


            switch (value) {
                case 1: {
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    Circle a = new Circle(radius);
                    System.out.println(a);
                    break;
                }

                case 2: {
                    System.out.print("Enter width , length: ");
                    double width = sc.nextDouble();
                    double length = sc.nextDouble();
                    Retangle a = new Retangle(width, length);
                    System.out.println(a);
                    break;
                }

                case 3: {
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    Square a = new Square(side);
                    System.out.println(a);
                    break;
                }

                default: {
                    System.out.println("Enter value  again");
                    break;
                }

            }
        } while (true);
    }
}
