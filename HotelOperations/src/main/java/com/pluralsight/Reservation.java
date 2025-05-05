package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation() {

    }

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    //region getters and setters
    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return this.weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice() {
        return this.calculatePrice();
    }

    public double getReservationTotal() {
        return this.getPrice() * this. getNumberOfNights();
    }
    //endregion

    private double calculatePrice() {
        double price = 140.39;
        if (this.roomType.equalsIgnoreCase("king")) {
            price = 139;
        }
        else if (this.roomType.equalsIgnoreCase("double")) {
            price = 124;
        }
        if (isWeekend()) {
            price *= 1.1;
        }
        return price;
    }
}
