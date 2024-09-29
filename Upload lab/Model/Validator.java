
package Model;

import java.util.Scanner;

public class Validator {

    public Validator() {
    }

    Scanner sc = new Scanner(System.in);

    public int getInt(String messageInfo, String messageError) {
        String number;
        do {
            System.out.print(messageInfo);
            number = sc.nextLine();
            if (!number.matches("[0-9]+")) {
                System.err.println(messageError);
            }
        } while (!number.matches("[0-9]+"));
        int convertNumber = Integer.parseInt(number);

        return convertNumber;
    }

    
    public int getInt2(
            String messageInfo,
            String messageErrorOutOfRange,
            String messageErrorInvalidNumber,
            int min, int max) {
        do {
            try {
                System.out.print(messageInfo);
                int number = Integer.parseInt(sc.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.err.println(messageErrorOutOfRange);
            } catch (NumberFormatException e) {
                System.err.println(messageErrorInvalidNumber);
            }
        } while (true);
    }
    
    public double getDouble(
            String messageInfo,
            String messageError) {
        String number;
        do {
            System.out.print(messageInfo);
            number = sc.nextLine();
            if (!number.matches("^[0-9]+(\\.[0-9]+)?$")) {
                System.err.println(messageError);
            }
        } while (!number.matches("^[0-9]+(\\.[0-9]+)?$"));
        double convertNumber = Double.parseDouble(number);

        return convertNumber;
    }

    public String getString(String messageInfo, String messageError,
            final String REGEX) {
        do {
            System.out.print(messageInfo);
            String str = sc.nextLine();
            if (str.matches(REGEX)) {
                return str;
            }
            System.err.println(messageError);
        } while (true);
    }


    public boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.equals("Y") || result.equals("y")) {
                return true;
            } else if (result.equals("N") || result.equals("n")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
