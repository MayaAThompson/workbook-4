package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testNormalCheckIn() {
        Room testRoom = new Room(1, false, false);

        testRoom.checkIn();

        boolean actual = testRoom.isDirty() && testRoom.isOccupied();
        assertTrue(actual);
    }

    @Test
    void testCheckInToDirtyRoom() {
        Room testRoom = new Room(1,false, true);

        testRoom.checkIn();

        boolean actual = testRoom.isDirty() && !testRoom.isOccupied();
        assertTrue(actual);
    }

    @Test
    void testNormalCheckOut() {
        Room testRoom = new Room(1, true, true);

        testRoom.checkOut();

        boolean actual = testRoom.isDirty() && !testRoom.isOccupied();
        assertTrue(actual);
    }

    @Test
    void testCleanCheckedOutRoom() {
        Room testRoom = new Room(1, false, true);

        testRoom.cleanRoom();

        boolean actual = !testRoom.isOccupied() && !testRoom.isDirty();
        assertTrue(actual);
    }

    @Test
    void testCleanOccupiedRoom() {
        Room testRoom = new Room(1, true, true);

        testRoom.cleanRoom();

        boolean actual = !testRoom.isOccupied() && !testRoom.isDirty();
        assertFalse(actual);
    }
}