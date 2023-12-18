package xyz.yeems214;

import xyz.yeems214.PCSO.sixFortyTwo;

import java.util.Scanner;

public class Main {

    public static void text(String splashScreen, String items) {
        System.out.println(splashScreen);
        System.out.println(items);
    }

    public static void Scanner() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                sixFortyTwo.main(null);
                break;
            default:
                System.out.println("Invalid choice!");
                Scanner();
        }
        scanner.close();
    }
    public static void main(String[] args) {
        String splashScreen = "Welcome to the Random Number Generator Software!";
        String items = "Press 1 for 6/42";
        text(splashScreen, items);
        Scanner();
    }
}