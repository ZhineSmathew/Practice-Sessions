package com.training.question4;

public class TicketBooking {
    void bookingDetails(String busName, String destination, String source, String... passengerNames) {
        System.out.println("Bus Name: " + busName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Passenger List:");
        for (String passenger : passengerNames) {
            System.out.println("> " + passenger);
        }
    }
}
