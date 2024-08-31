package Exercise_66;
import java.util.Scanner;
public class TestAnimal {

    public static void typeOfDog(int choice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tye of dog");
        System.out.println("1. Dog A");
        System.out.println("2. Dog B");
        System.out.print("Enter your choice: ");
        int type = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1: {
                switch (type) {
                    case 1: {
                        System.out.print("Name: ");
                        Dog a = new Dog(sc.nextLine());
                        System.out.println(a);
                        a.greets();
                        break;
                    }
                    case 2: {
                        System.out.print("Name: ");
                        Dog a = new Dog(sc.nextLine());
                        System.out.println(a);
                        a.greets(new Dog("Another dog"));
                        break;
                    }
                    default: {
                        System.out.println("Wrong choice\n\n");
                        break;
                    }
                }
                break;
            }
            case 2: {
                switch (type) {
                    case 1: {
                        System.out.print("Name: ");
                        BigDog a = new BigDog(sc.nextLine());
                        System.out.println(a);
                        a.greets();
                        break;
                    }
                    case 2: {
                        System.out.print("Name: ");
                        BigDog a = new BigDog(sc.nextLine());
                        System.out.println(a);
                        a.greets(new Dog("Another dog"));
                        break;
                    }
                    default: {
                        System.out.println("Wrong choice\n\n");
                        break;
                    }
                }
                break;
            }
            default:{
                System.out.println("Wrong choice\n\n");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Greets of animal");
        String name;
        int choice, choiceOfDog;
        boolean check = true;
        while (check) {

            System.out.println("1. Cat");
            System.out.println("2. Dog");
            System.out.println("Another number to exit");
            System.out.print("Enter your choice:");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.print("Name: ");
                Cat a = new Cat(sc.nextLine());
                System.out.println(a +"\n\n");
                a.greets();
            } else if (choice == 2) {
                System.out.println("1. Normal dog");
                System.out.println("2. Big dog");
                System.out.print("Enter your choice:");
                choiceOfDog = Integer.parseInt(sc.nextLine());
                if (choiceOfDog ==1 || choiceOfDog ==2) {
                    typeOfDog(choiceOfDog);
                    System.out.print("\n\n");
                }
                else{
                    System.out.println("Wrong choice\n\n");
                }
            }
            else {
                System.out.println("Byeee!!!");
                check = false;
            }
        }
    }
}