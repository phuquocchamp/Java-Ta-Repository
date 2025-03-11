package Exercise_65;

import java.util.Scanner;
public class TestResizableCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius' information:");
        System.out.print("Enter radius = ");
        double radius = Double.parseDouble(sc.nextLine());
        ResizableCircle a = new ResizableCircle(radius);
        System.out.println(a +"\n\n");
        boolean check = true;

        int choice;
        while (check){
            System.out.println("1. Change size of radius");
            System.out.println("Other to exit");
            System.out.print("Enter your choice:");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.println("New radius = Old radius * percent");
                System.out.print("Radius percent = ");
                double percent = Double.parseDouble(sc.nextLine());
                a.resize(percent);
                System.out.println(a +"\n\n");
            }
            else {
                check = false;
                System.out.println("Bye!!!");
            }
        }
    }
}
