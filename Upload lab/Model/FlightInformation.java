
package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FlightInformation {
    protected String flightInformation;
    protected String seatNumbber;
    protected LocalDateTime timePickUp;

    public FlightInformation() {
        flightInformation ="";
        seatNumbber= "";
        timePickUp= timePickUp.now();
    }

    public FlightInformation(String flightInformation, String seatNumbber, LocalDateTime timePickUp) {
        this.flightInformation = flightInformation;
        this.seatNumbber = seatNumbber;
        this.timePickUp = timePickUp;
    }

    public String getFlightInformation() {
        return flightInformation;
    }

    public void setFlightInformation(String flightInformation) {
        this.flightInformation = flightInformation;
    }

    public String getSeatNumbber() {
        return seatNumbber;
    }

    public void setSeatNumbber(String seatNumbber) {
        this.seatNumbber = seatNumbber;
    }

    public LocalDateTime getTimePickUp() {
        return timePickUp;
    }

    public void setTimePickUp(LocalDateTime timePickUp) {
        this.timePickUp = timePickUp;
    }

    @Override
    public String toString() {
        return " - " + flightInformation + " - " + seatNumbber + " - " + timePickUp.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a"));
    }

    
}
