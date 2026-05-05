package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(2001,"Jsutin","Cook", 20,20);
        System.out.println(employee.getTotalPay());
    }
}