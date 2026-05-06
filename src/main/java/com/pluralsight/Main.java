package com.pluralsight;

public class Main {
    public static void main(String[] args) {



        //  Hotel
        System.out.println("\n Hotel ");
        Hotel hotel = new Hotel("Amani 's Inn", 5, 20);
        System.out.println("Available suites: " + hotel.getAvailableSuites()); // 5
        System.out.println("Available rooms:  " + hotel.getAvailableRooms());  // 20

        System.out.println("Book 2 suites: " + hotel.bookRoom(2, true));   // true
        System.out.println("Book 4 suites: " + hotel.bookRoom(4, true));   // false (only 3 left)
        System.out.println("Book 3 suites: " + hotel.bookRoom(3, true));   // true (now full)
        System.out.println("Suites left: " + hotel.getAvailableSuites()); // 0

        System.out.println("Book 15 rooms: " + hotel.bookRoom(15, false)); // true
        System.out.println("Book 10 rooms: " + hotel.bookRoom(10, false)); // false (only 5 left)
        System.out.println("Rooms left: " + hotel.getAvailableRooms());   // 5

        // Hotel that starts with rooms already booked
        Hotel busy = new Hotel("Busy Hotel", 10, 30, 8, 25);
        System.out.println("Busy suites left: " + busy.getAvailableSuites()); // 2
        System.out.println("Busy rooms left:  " + busy.getAvailableRooms());  // 5
}
}