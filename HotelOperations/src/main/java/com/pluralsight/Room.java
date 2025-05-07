package com.pluralsight;

public class Room {

    private int numberOfBeds; //double has 1 bed, king has 2 beds
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    //region getters and setters
    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getPrice() {
        return this.getNumberOfBeds() * 15 + 109;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    public void setIsOccupied(boolean occupancy) {
        this.occupied = occupancy;
    }

    public void setIsDirty(boolean cleanliness) {
        this.dirty = cleanliness;
    }
    //endregion

    public void checkIn() {
        if (isAvailable()) {
            this.setIsOccupied(true);
            this.setIsDirty(true);
        }
        else {
            System.out.println("This room is not available for check in yet.");
        }
    }

    public void checkOut() {
        this.setIsOccupied(false);
    }

    public void cleanRoom() {
        if (!isOccupied()) {
            this.setIsDirty(false);
        }
        else {
            System.out.println("Cannot clean an occupied room.");
        }
    }

}
