package lab2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Person> persons = new ArrayList<>();

    public static void menu() {
        System.out.println("1. Teachers");
        System.out.println("2. Student");
        System.out.println("3. Person");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void menu2() {
        System.out.println("1. Input");
        System.out.println("2. Print");
        System.out.println("3. Person");
        System.out.print("Enter your choice: ");
    }

    public static int checkInput(int min, int max) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("Choose from " + min + "to" + max);
                System.out.print("Enter again: ");
            }
        }
    }

    public static void add(int choice) {
        Scanner sc = new Scanner(System.in);
        String id;
        do {
            System.out.print("Ener id: ");
            id = sc.nextLine();
        } while (!id.matches("[0-9]{6}"));

        String name;
        do {
            System.out.print("Enter full  name: ");
            name = sc.nextLine();
        } while (!name.contains(" "));

        String phone;
        do {
            System.out.print("Enter phone number: ");
            phone = sc.nextLine();
        } while (!phone.matches("0[0-9]{9}"));

        String yearOfBirth;
        do {
            System.out.print("Enter Year (1900 -> 2023: ");
            yearOfBirth = sc.nextLine();
        } while (!yearOfBirth.matches("^(19[0-9]{2}|{2}|20(0[0-9]|1[0-9]|2[0-3]))$"));
        String major;
        do {
            System.out.print("Enter major: ");
            major = sc.nextLine();
        } while (!major.matches("[a-zA-Z]{2,30}"));
        switch (choice) {
            case 1: {
                String yearProfession;
                int year;
                do {
                    System.out.print("Enter year of profession: ");
                    yearProfession = sc.nextLine();
                    year = Integer.parseInt(yearOfBirth) - Integer.parseInt(yearProfession);
                } while (year < 0);

                String constant;
                do {
                    System.out.print("Enter constant type: ");
                    constant = sc.nextLine();
                } while (!(constant.equals("Long") || constant.equals("Short")));
                System.out.print("Enter salary coefficient : ");
                double salaryCoe = Double.parseDouble(sc.nextLine());

                Person teacher = new Teacher(year, constant, salaryCoe, id, name, phone, yearOfBirth, major);
                persons.add(teacher);
                break;
            }
            case 2: {
                int yearAdmission;
                int age;
                do {
                    System.out.print("Enter year of admission: ");
                    yearAdmission = sc.nextInt();
                    age = Integer.parseInt("2023") - Integer.parseInt(yearOfBirth);
                } while (yearAdmission > age);

                int entranceEnglish;
                do {
                    System.out.print("Enter constant type: ");
                    entranceEnglish = sc.nextInt();
                } while (entranceEnglish < 0 && entranceEnglish > 100);
                Person student = new Student(yearAdmission, entranceEnglish, id, name, phone, yearOfBirth, major);
                persons.add(student);
                break;
            }
        }
    }
//    static void print(int choice) {
//        if (choice == 1) {
//            Person t = new Teacher();
//            for (Person p : persons) {
//                if (p instanceof Teacher teacher) {
//                    persons.sort(Comparator.comparingInt(p.getYearProfession()));
//                }
//
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            menu();
            int choice = checkInput(1, 4);
            switch (choice) {
                case 1: {
                    menu2();
                    int choice2 = checkInput(1, 3);
                    switch (choice2) {
                        case 1: {
                            add(choice);
                        }
                        case 2: {
                            for (Person p : persons) {
                                if (p instanceof Teacher teacher) {
                                    System.out.println(p);
                                }
                            }
                            break;
                        }
                        case 3: {
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    menu2();
                    int choice2 = checkInput(1, 3);
                    switch (choice2) {
                        case 1: {
                            add(2);
                            break;
                        }
                        case 2: {
                            for (Person p : persons) {
                                if (p instanceof Student student) {
                                    System.out.println(p);
                                }
                            }
                            break;
                        }
                        case 3: {
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("1.Search");
                    System.out.println("2.Print All");
                    System.out.println("3.Exit");
                    int choice2 = checkInput(1, 3);
                    switch (choice2) {
                        case 1: {
                            System.out.println("Enter name to search: ");
                            String key = sc.nextLine();
                            for (Person p : persons) {
                                if (p.getFullName().contains(key)) {
                                    System.out.println(p);
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.println(persons);
                            break;
                        }
                        case 3:
                            break;
                    }

                }
                case 4: {
                    break;
                }
            }
        }
    }
}
