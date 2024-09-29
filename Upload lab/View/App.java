package View;

import Controller.Manager;
import Model.FlightInformation;
import Model.Validator;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {
        boolean check = true;
        Manager manager = new Manager();
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);
        while (check) {
            System.out.println("*** Reservation Management ***");
            System.out.println("1. Create new reservation");
            System.out.println("2. Update reservation");
            System.out.println("3. Delete reservation");
            System.out.println("4. Print Flight Information ");
            System.out.println("5. Print all");
            System.out.println("6. Exit");
            int choice = validator.getInt2("Enter your choice: ", "Enter from 1 -> 6 ", "Input is an invalid", 1, 6);
            switch (choice) {
                case 1: {
                    System.out.println("*** Create new reservation ***");
                    String id;
                    while (true) {
                        id = validator.getString("Enter ID (6 digits): ", "ID is an invalid", "[0-9]{6}");
                        if (manager.searchReservation(id) != null) {
                            System.out.println("This ID was existed. Please enter another id.");
                        } else {
                            break;
                        }
                    }
                    String nameOfCustomer = validator.getString("Enter name: ", "Name is an invalid", "[A-Za-z\\s]+");
                    String phoneNumber = validator.getString("Enter phone number: ", "Phone number is an invalid", "0[0-9]{9}");
                    String roomNumber = validator.getString("Enter room number: ", "Room number is an  invalid", "[0-9]+");
                    LocalDate current = LocalDate.now();
                    LocalDate dateTime = null;
                    while (true) {
                        boolean isValid = false;
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        do {
                            System.out.print("Enter BookDate (dd/MM/yyyy): ");
                            String input = scanner.nextLine();
                            try {
                                dateTime = LocalDate.parse(input, formatter);
                                isValid = true;
                            } catch (DateTimeParseException e) {
                                System.err.println("Time Pickup is an invalid!");
                            }
                        } while (!isValid);
                        if (dateTime.isAfter(current)) {
                            break;
                        } else {
                            System.err.println("Booking date has to after current.");
                        }
                    }
                    String flight = "";
                    String seat = "";
                    LocalDateTime pickUp = LocalDateTime.now();
                    System.out.print("Need airport pick up? (Y/N):");
                    if (validator.checkInputYN() == true) {
                        flight = validator.getString("Flight (6 characters): ", "Flight is an invalid", "[A-Za-z0-9]{6}");
                        seat = validator.getString("Seat (4 characters): ", "Seat is an invalid", "[A-Za-z0-9]{4}");
                        boolean isValid = false;
                        while (true) {
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
                            do {
                                System.out.print("Time Pickup (dd/MM/yyyy hh:mm a): ");
                                String input = scanner.nextLine();
                                try {
                                    pickUp = LocalDateTime.parse(input, formatter);
                                    isValid = true;
                                } catch (DateTimeParseException e) {
                                    System.err.println("Time Pickup is an invalid!");
                                }
                            } while (!isValid);
                            if (pickUp.toLocalDate().isAfter(current) && pickUp.toLocalDate().isBefore(dateTime)) {
                                FlightInformation flightInformation = new FlightInformation(flight, seat, pickUp);
                                manager.createReservation(id, nameOfCustomer, phoneNumber, roomNumber, dateTime, flightInformation);
                                break;
                            } else {
                                System.err.println("Pickup date has to after current and before booking date.");
                            }
                        }
                    } else {
                        FlightInformation flightInformation = new FlightInformation(flight, seat, pickUp);
                        manager.createReservation(id, nameOfCustomer, phoneNumber, roomNumber, dateTime, flightInformation);
                    }
                    break;
                }
                case 2: {
                    System.out.println("*** Update reservation ***");
                    while (true) {
                        String checkID = validator.getString("Enter id (6 digits): ", "ID is an invalid", "[0-9]{6}");
                        if (manager.searchReservation(checkID) != null) {
                            System.out.println(manager.searchReservation(checkID));
                            String reName;
                            while (true) {
                                System.out.print("Name: ");
                                reName = scanner.nextLine();
                                if (reName.matches("[A-Za-z\\s]+") || reName.matches("")) {
                                    break;
                                }
                                    System.err.println("Name is an invalid");                    
                            }

                            String rePhone;
                            while (true) {
                                System.out.print("Phone: ");
                                rePhone = scanner.nextLine();
                                if (rePhone.matches("0[0-9]{9}") || rePhone.matches("")) {
                                    break;
                                }
                                System.err.println("Phone number is an invalid");
                            }

                            String reRoom;
                            while (true) {
                                System.out.print("Booking Room: ");
                                reRoom = scanner.nextLine();
                                if (reRoom.matches("[0-9]+") || reRoom.matches("")) {
                                    break;
                                }
                                System.err.println("Booking room is an invalid");
                            }
                            boolean isValid = false;
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            LocalDate reDate;
                            do {
                                System.out.print("Date (dd/MM/yyyy): ");
                                String input = scanner.nextLine();
                                if (input == "") {
                                    break;
                                }
                                try {
                                    reDate = LocalDate.parse(input, formatter);
                                    System.out.println(manager.updateReservation(checkID, reName, rePhone, reRoom, reDate));
                                    isValid = true;
                                } catch (DateTimeParseException e) {
                                    System.err.println("Date Booking is an invalid!");
                                }
                            } while (!isValid);
                            System.out.println("Information saved successfully.");
                            break;
                        } else {
                            System.err.println("Not found ID.");
                            System.out.print("Do you want to continue (Y/N) ");
                            if (!validator.checkInputYN()) {
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }

                case 3: {
                    System.out.println("*** Delete reservation ***");
                    while (true) {
                        String checkID = validator.getString("Enter id (6 digits): ", "ID is an invalid", "[0-9]{6}");
                        if (manager.searchReservation(checkID) != null) {
                            System.out.print("Are you sure you want to delete this information? (Y/N) ");
                            if (validator.checkInputYN()) {
                                manager.deleteReservation(checkID);
                            }
                            break;
                        }
                        System.err.println("Not found ID.");
                        System.out.print("Do you want to continue (Y/N) ");
                        if (!validator.checkInputYN()) {
                            break;
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("*** Flight Information ***");
                    System.out.println("ID - Name - Phone - Flight - Seat - TimePickUp");
                    manager.printReservation();
                    break;
                }
                case 5: {
                    System.out.println("*** Reservation Information ***");
                    System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
                    manager.printAll();
                    break;
                }
                case 6: {
                    check = false;
                    break;
                }

            }
        }
    }
}
