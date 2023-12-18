package xyz.yeems214.PCSO;

import java.util.Random;

public class sixFiftyEight {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            // Generate valid two-digit number within 1-42 range
            int num = 1 + random.nextInt(58);
            // Extract and store individual digits
            int firstDigit = num / 10;
            int secondDigit = num % 10;
            // Concatenate and store in array
            String numberString = firstDigit + "" + secondDigit;
            array[i] = Integer.parseInt(numberString);
        }

        System.out.println("Random 6-number array (6/58):");
        for (int number : array) {
            System.out.print(number + " ");
        }

    }
}