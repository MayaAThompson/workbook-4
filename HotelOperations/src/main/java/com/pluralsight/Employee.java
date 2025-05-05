package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

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
    //endregion

}
