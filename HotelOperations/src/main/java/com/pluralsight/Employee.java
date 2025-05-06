package com.pluralsight;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private boolean working;
    private LocalTime clockInTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    //region getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return (this.getRegularHours() * this.payRate) + (this.getOvertimeHours() * this.payRate);
    }

    public double getRegularHours() {
        if (this.hoursWorked > 40) {
            return 40;
        }
        return this.hoursWorked;
    }

    public double getOvertimeHours() {
        if (this.hoursWorked > 40){
            return this.hoursWorked - 40;
        }
        return 0;
    }

    private boolean isWorking() {
        return this.working;
    }

    private void setIsWorking(boolean isWorking) {
        this.working = isWorking;
    }
    //endregion

    public void punchTimeCard(double time) {
        LocalTime timeClock;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        timeClock = LocalTime.parse(Double.toString(time), timeFormatter);
        if (!this.isWorking()) {
            this.clockInTime = timeClock;
            this.setIsWorking(true);
        }
        else {
            Duration duration = Duration.between(clockInTime, timeClock);
            long hours = duration.toHours();
            long minutes = duration.toMinutes();
            double timeWorked = Double.parseDouble(hours + "." + minutes);
            hoursWorked += timeWorked;
            this.setIsWorking(false);
        }
    }

}
