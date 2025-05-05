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
        if (!isOccupied() && !isDirty()) {
            return true;
        }
        return false;
    }

    public void setIsOccupied(boolean occupancy) {
        this.occupied = occupancy;
    }

    public void setIsDirty(boolean cleanliness) {
        this.dirty = cleanliness;
    }
    //endregion

}
