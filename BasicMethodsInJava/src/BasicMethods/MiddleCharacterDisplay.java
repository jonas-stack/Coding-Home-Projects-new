package BasicMethods;

import java.util.Scanner;

// Write a Java method to display the middle character of a string.
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.
//Test Data:
//Input a string: 350
//Expected Output:
//
//
//The middle character in the string: 5

/**
 * This class displays the middle character(s) of a string.
 * Note: If the length of the string is odd, there will be one middle character. If it is even, there will be two middle characters.
 */
public class MiddleCharacterDisplay {

    // Constants for better understanding
    private static final int ADJUSTMENT_FOR_EVEN_LENGTH = 1;
    private static final int ADJUSTMENT_FOR_ODD_LENGTH = 0;
    private static final int CHARACTERS_IN_EVEN_LENGTH = 2;
    private static final int CHARACTERS_IN_ODD_LENGTH = 1;

    /**
     * Prompts the user to input a string and displays the middle character(s).
     */
    public static void exercise3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();
        System.out.print("The middle character in the string: " + findMiddleCharacter(inputString)+"\n");
    }

    /**
     * Finds the middle character(s) of the input string.
     *
     * @param inputString The input string for which the middle character(s) needs to be found.
     * @return The middle character(s) of the input string.
     */
    public static String findMiddleCharacter(String inputString) {
        int position;
        int length;
        if (inputString.length() % 2 == 0) {
            position = inputString.length() / 2 - ADJUSTMENT_FOR_EVEN_LENGTH;
            length = CHARACTERS_IN_EVEN_LENGTH;
        } else {
            position = inputString.length() / 2;
            length = CHARACTERS_IN_ODD_LENGTH;
        }
        return inputString.substring(position, position + length);
    }
}

