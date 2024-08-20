package org.example;

public class Utilities {

/*
    public static int addTrailingZeros(int input) {

        String formatted = String.valueOf(input);

        int difference = 7 - formatted.length();

        for (int i = 0; i < difference; i++) {
            input = input * 10;
        }

        return input;

    }
*/
    public static int addTrailingZeros(int input) {

        String formatted = String.valueOf(input);

        int difference = 7 - formatted.length();

        for (int i = 0; i < difference; i++) {
            formatted += "0";
        }

        return Integer.parseInt(formatted);

    }


}