package Exercise_46;
import java.util.Scanner;
public class Application {

    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while(check){
            System.out.println("Menu show greets of animal:");
            System.out.println("1. Cat.");
            System.out.println("2. Dog.");
            System.out.println("Other number to exit.");
            System.out.print("Choose: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:{
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    Cat a =  new Cat(name);
                    System.out.println(a);
                    a.greets();
                    System.out.println("\n\n");
                    break;
                }
                case 2:{
                    boolean checkDog = true;
                    while (checkDog){
                        System.out.println("Type of dog:");
                        System.out.println("1. Dog A");
                        System.out.println("2. Dog B");
                        System.out.println("Other number to exit.");
                        System.out.print("Choose : ");
                        int typeOfDog = Integer.parseInt(sc.nextLine());
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        switch (typeOfDog){
                            case 1:{
                                Dog a = new Dog (name);
                                System.out.println(a);
                                a.greets();
                                break;
                            }
                            case 2:{
                                Dog a = new Dog (name);
                                System.out.println(a);
                                a.greets(new Dog("Another Dog"));
                                break;
                            }
                            default:{
                                checkDog = false;
                                break;
                            }
                        }
                        System.out.println("\n\n");
                    }
                }
                default:{
                    check = false;
                    break;
                }
            }
        }

    }
}
