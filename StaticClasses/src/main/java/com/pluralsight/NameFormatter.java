package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {

    }

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format (String prefix, String firstName, String middleName, String lastName, String suffix) {
        return String.format("%s, %s %s %s, %s", lastName, prefix, firstName, middleName, suffix);
    }

    public static String format (String firstName, String middleName, String lastName, String suffix) {
        return String.format("%s, %s %s, %s", lastName, firstName, middleName, suffix);
    }

    public static String format (String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 2) {
            return String.format("%s %s", nameParts[1], nameParts[0]);
        }
        if (nameParts.length == 3) {
            return String.format("%s %s %s", nameParts[2], nameParts[0], nameParts[1]);
        }
        if (nameParts.length == 4) {
            return String.format("%s %s %s %s", nameParts[2], nameParts[0], nameParts[1], nameParts[3]);
        }
        if (nameParts.length == 5) {
            return String.format("%s %s %s %s %s",nameParts[3], nameParts[0], nameParts[1], nameParts[2], nameParts[4]);
        }
        else {
            throw new RuntimeException("Invalid name formatting");
        }
    }
}
