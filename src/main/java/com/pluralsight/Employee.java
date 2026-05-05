package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private int punchInTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    //  Punch In (manual)
    public void punchIn(int time) {
        punchInTime = time;
    }

    // Punch In (current time)
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        punchInTime = now.getHour(); // simplified to hour
    }

    //  Punch Out (manual)
    public void punchOut(int time) {
        int hours = time - punchInTime;
        hoursWorked += hours;
    }

    //  Punch Out (current time)
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        int currentHour = now.getHour();
        int hours = currentHour - punchInTime;
        hoursWorked += hours;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return hoursWorked * payRate;
    }
}