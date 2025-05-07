package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {

    @org.junit.jupiter.api.Test
    void testDaytimeClockInClockOut() {
        double i = 8.0; //clock in time
        double j = 16.0; //clock out time
        Employee employee = new Employee(1234, "Maya", "Testing", 1);
        double expected = 8.0;

        employee.punchTimeCard(i);
        employee.punchTimeCard(j);

        double actual = employee.hoursWorked;
        assertEquals(expected, actual);
    }

    @Test
    void testOverNightClockInClockOut() {
        double i = 22.0; //clock in time
        double j = 6.0; //clock out time
        Employee employee = new Employee(1234, "Maya", "Testing", 1);
        double expected = 8.0;

        employee.punchTimeCard(i);
        employee.punchTimeCard(j);

        double actual = employee.hoursWorked;
        assertEquals(expected, actual);
    }
}