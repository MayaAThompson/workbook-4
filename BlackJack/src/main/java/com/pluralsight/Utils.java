package com.pluralsight;

import java.util.Scanner;

//common utilities
public class Utils {

    static Scanner scanner = new Scanner(System.in);

    //passes in a String message, prints that message to the console and returns user input on same line

    public static String messageAndResponse(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    //pauses the program and continues on the next user input "enter"

    public static void pauseReturn() {
        System.out.print("Press Enter to Continue: ");
        scanner.nextLine();
    }
}
