package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private String roomNumber;
    private LocalDate dateTime;
    private FlightInformation flightInformation;

    public Reservation() {
        this.bookingID = "";
        this.customerName = "";
        this.phoneNumber = "";
        this.roomNumber = "";
        this.dateTime = LocalDate.now();
        this.flightInformation = new FlightInformation();
    }

    public Reservation(String bookingID, String customerName, String phoneNumber, String roomNumber, LocalDate dateTime, FlightInformation flightInformation) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.dateTime = dateTime;
        this.flightInformation = flightInformation;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    public void setFlightInformation(FlightInformation flightInformation) {
        this.flightInformation = flightInformation;
    }
    
    
    @Override
    public String toString() {
        return bookingID + " - " + customerName + " - " + phoneNumber + " - " + roomNumber + " - " +
                dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + flightInformation.toString();
    }

   
    
    

}
