package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    // I am about to create constructor
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {


        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    //Derived
    public boolean isAvailable() {
        if (!isOccupied && !isDirty) {
            return true;
        }
        return  false;
    }
    // creating check in method

    public void checkIn(){
        if (isAvailable()){
            isOccupied=true;
            isDirty=true;
            System.out.println("Guest checked in. Room is now occupied and dirty.");
        } else {
            System.out.println("Room is not available for check in");
        }
    }
    public void checkOut(){
        isOccupied=false;
        cleanRoom();
    }
    public void cleanRoom(){
        isDirty= false;

    System.out.println("Room has been cleaned");
}

}
