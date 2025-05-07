package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testNormalCheckIn() {
        Room testRoom = new Room(1, false, false);

        boolean checkInSuccessful = testRoom.checkIn();

        assertTrue(checkInSuccessful);
    }

    @Test
    void testCheckInToDirtyRoom() {
        Room testRoom = new Room(1,false, true);

        boolean checkInSuccessful = testRoom.checkIn();

        assertFalse(checkInSuccessful);
    }

    @Test
    void testNormalCheckOut() {
        Room testRoom = new Room(1, true, true);

        boolean checkOutSuccessful = testRoom.checkOut();

        assertTrue(checkOutSuccessful);
    }

    @Test
    void testCheckOutEmptyRoom() {
        Room testRoom = new Room(1, false, true);

        boolean checkOutSuccessful = testRoom.checkOut();

        assertFalse(checkOutSuccessful);
    }

    @Test
    void testCleanCheckedOutRoom() {
        Room testRoom = new Room(1, false, true);

        boolean cleanSuccessful = testRoom.cleanRoom();

        assertTrue(cleanSuccessful);
    }

    @Test
    void testCleanOccupiedRoom() {
        Room testRoom = new Room(1, true, true);

        boolean cleanSuccessful = testRoom.cleanRoom();

        assertFalse(cleanSuccessful);
    }
    @Test
    void testCleanAlreadyCleanRoom() {
        Room testRoom = new Room(1, false, false);

        boolean cleanSuccessful = testRoom.cleanRoom();

        assertFalse(cleanSuccessful);
    }
}