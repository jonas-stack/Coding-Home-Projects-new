package BasicMethods;

import java.util.Scanner;

/*
Write a Java method to count all the words in a string.
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9
 */

public class CountAllWordsInString {

    public static void exercise5() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.print("Number of words in the string: " + countWords(str) + "\n");
        in.close(); // Closing the Scanner
    }

    public static int countWords(String str) {
        int countWords = 0;
        if (!isSpace(str.charAt(0)) || !isSpace(str.charAt(str.length() - 1))) {
            for (int i = 0; i < str.length(); i++) {
                if (isSpace(str.charAt(i))) {
                    countWords++;
                }
            }
            countWords++; // increment for the last word
        }
        return countWords;
    }

    private static boolean isSpace(char c) {
        return c == ' ';
    }
}

