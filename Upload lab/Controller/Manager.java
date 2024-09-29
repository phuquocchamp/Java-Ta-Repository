package Controller;

import Model.FlightInformation;
import Model.Reservation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager {

    List<Reservation> reservations = new ArrayList<>();

    public Reservation createReservation(
            String bookingID,
            String customerName,
            String phoneNumber,
            String roomNumber,
            LocalDate dateTime,
            FlightInformation flightInformation
    ) {
        Reservation reservation = new Reservation(bookingID, customerName, phoneNumber, roomNumber, dateTime, flightInformation);
        reservations.add(reservation);
        return reservation;
    }

    public Reservation searchReservation(String bookingID) {
        for (Reservation re : reservations) {
            if (re.getBookingID().equals(bookingID)) {
                return re;
            }
        }
        return null;
    }

    public Reservation updateReservation(
            String bookingID,
            String customerName,
            String phoneNumber,
            String roomNumber,
            LocalDate dateTime
            ) {
        for (Reservation re : reservations) {
            if (re.getBookingID().equals(bookingID)) {
                if (!customerName.equals("\n")) {
                    re.setCustomerName(customerName);
                }
                if (!phoneNumber.equals("\n")) {
                    re.setPhoneNumber(phoneNumber);
                }
                if (!roomNumber.equals("\n")) {
                    re.setRoomNumber(roomNumber);
                }
                    re.setDateTime(dateTime);
                }
                return re;
            }
        
        return null;
    }

    public boolean deleteReservation(String bookingID) {
        Reservation retrievedRe = this.searchReservation(bookingID);
        return reservations.remove(retrievedRe);
    }

    public void printReservation() {
        if (reservations.isEmpty()) {
            System.err.println("List is empty.");
        }
        for (Reservation r : reservations) {
            System.out.println(r.getBookingID() + " - " + r.getCustomerName() + " - " + r.getPhoneNumber() + " - " + r.getFlightInformation());
        }
    }

    public void printAll() {
        if (reservations.isEmpty()) {
            System.err.println("List is empty.");
        }
        for (Reservation r : reservations) {
            System.out.println(r);
        }
    }

}
