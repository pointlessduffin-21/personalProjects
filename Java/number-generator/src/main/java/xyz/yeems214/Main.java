package xyz.yeems214;

import xyz.yeems214.PCSO.sixFiftyEight;
import xyz.yeems214.PCSO.sixFortyFive;
import xyz.yeems214.PCSO.sixFortyNine;
import xyz.yeems214.PCSO.sixFortyTwo;

import java.util.Scanner;

public class Main {

    public static void text(String splashScreen, String item1, String item2, String item3, String item4, String item9, String item0) {
        System.out.println(splashScreen);
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println(item9);
        System.out.println(item0);
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
                    sixFortyFive.main(null);
                    main(null);
                case 3:
                    sixFortyNine.main(null);
                    main(null);
                case 4:
                    sixFiftyEight.main(null);
                    main(null);
                case 9:
                    sixFortyTwo.main(null);
                    sixFortyNine.main(null);
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
        String item2 = "Press 2 for 6/45";
        String item3 = "Press 3 for 6/49";
        String item4 = "Press 4 for 6/58";
        String item9 = "Press 9 for All";
        String item0 = "Press 0 to quit";
        text(splashScreen, item1, item2, item3, item4, item9, item0);
        Scanner();
    }
}