package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Employee Test --------
        Employee emp = new Employee(1, "John", "Front Desk", 20);

        emp.punchIn(9);
        emp.punchOut(17);

        emp.punchIn();   // current time
        emp.punchOut();  // current time

        System.out.println("Hours worked: " + emp.getHoursWorked());
        System.out.println("Total pay: $" + emp.getTotalPay());

        // -------- Hotel Test --------
        Hotel hotel = new Hotel("Hilton", 5, 10);

        System.out.println("Suites available: " + hotel.getAvailableSuites());

        boolean success = hotel.bookRoom(2, true);

        System.out.println("Booking success: " + success);
        System.out.println("Suites left: " + hotel.getAvailableSuites());
    }
}