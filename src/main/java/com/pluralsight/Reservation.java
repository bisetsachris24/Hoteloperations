package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberofNights;
    private boolean isWeekends;

// creating constructor


    public Reservation(String roomType, int numberofNights, boolean isWeekends) {
        this.roomType = roomType;
        this.numberofNights = numberofNights;
        this.isWeekends = isWeekends;

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberofNights() {
        return numberofNights;
    }

    public void setNumberofNights(int numberofNights) {
        this.numberofNights = numberofNights;
    }

    public boolean isWeekends() {
        return isWeekends;
    }

    public void setWeekends(boolean weekends) {
        isWeekends = weekends;
    }
         //   method for getPrice
    public double getPrice () {
        if (roomType.equalsIgnoreCase("King")) {
            return 139.99;
        } else {
            return 124;
        }

    }
        public double getReservationTotal () {
            double price = getPrice();

            if (isWeekends) {
                price *= 1.10; // increase by 10%
            }

            return price * numberofNights;
        }
    }
