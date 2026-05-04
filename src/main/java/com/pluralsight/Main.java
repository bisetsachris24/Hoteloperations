package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // let's see if this works
        Room room1 = new Room(2, 124.00, false, false);
        Room room2 = new Room(1, 139.00, true, false);
        System.out.println("Room 1 available: " + room1.isAvailable()); // true
        System.out.println("Room 2 available: " + room2.isAvailable()); // false

        // Testing Reservation
        Reservation res1 = new Reservation("king", 3, false);
        Reservation res2 = new Reservation("double", 2, true);
        System.out.println("Res1 total: $" + res1.getReservationTotal()); // $417.00
        System.out.println("Res2 total: $" + res2.getReservationTotal()); // $272.80

        // Test Employee
        Employee emp1 = new Employee(1, "Alice", "Front Desk", 20.00, 45);
        System.out.println("Regular hours: " + emp1.getRegularHours());   // 40
        System.out.println("Overtime hours: " + emp1.getOvertimeHours()); // 5
        System.out.println("Total pay: $" + emp1.getTotalPay());          // $950.00
    }
}