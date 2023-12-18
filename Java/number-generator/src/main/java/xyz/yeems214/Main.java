package xyz.yeems214;

import xyz.yeems214.PCSO.sixFiftyEight;
import xyz.yeems214.PCSO.sixFortyNine;
import xyz.yeems214.PCSO.sixFortyTwo;

import java.util.Scanner;

public class Main {

    public static void text(String splashScreen, String item1, String item2, String item3, String item4) {
        System.out.println(splashScreen);
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
    }

    public static void Scanner() {
        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sixFortyTwo.main(null);
                    main(null);
                case 2:
                    sixFortyNine.main(null);
                    main(null);
                case 3:
                    sixFiftyEight.main(null);
                    main(null);
                case 0:
                    break;
                default:
                    System.out.println("\nInvalid choice!");
                    Scanner();
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("\nApplication Quit!");
//            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String splashScreen = "\n\nWelcome to the Random Number Generator Software!";
        String item1 = "Press 1 for 6/42";
        String item2 = "Press 2 for 6/49";
        String item3 = "Press 3 for 6/58";
        String item4 = "Press 0 to quit";
        text(splashScreen, item1, item2, item3, item4);
        Scanner();
    }
}