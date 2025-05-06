package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;

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
        if(!roomType.equalsIgnoreCase("king") && !roomType.equalsIgnoreCase("double")) {
            throw new RuntimeException("Invalid room type.");
        }
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
        if (this.roomType.equalsIgnoreCase("king")) {
            return 139;
        }
        else if (this.roomType.equalsIgnoreCase("double")) {
            return 124;
        }
        else {
            throw new RuntimeException("Invalid Room type");
        }
    }

    public double getReservationTotal() {
        return this.getPrice() * this. getNumberOfNights() * this.weekendModifier();
    }
    //endregion

    private double weekendModifier() {
        if(isWeekend()) {
            return 1.1;
        }
        else {
            return 1;
        }
    }
}
