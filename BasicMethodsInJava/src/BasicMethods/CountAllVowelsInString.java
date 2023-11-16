package BasicMethods;

import java.util.Scanner;

/*
Write a Java method to count all vowels in a string.
Test Data:
Input the string: w3resource
Expected Output:

Number of  Vowels in the string: 4
 */

public class CountAllVowelsInString {

    // Method to prompt the user to input a text and display the count of vowels
    public static void exercise4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String inputString = scanner.nextLine();
        System.out.print("The number of vowels is: " + countVowels(inputString) + "\n");
    }

    // Method to count the number of vowels in the input string
    public static int countVowels(String inputString) {
        int vowelCount = 0; // Initialize the count of vowels to 0
        for (int i = 0; i < inputString.length(); i++) { // Iterate through each character in the input string
            char currentChar = inputString.charAt(i); // Get the current character
            if (isVowel(currentChar)) { // Check if the current character is a vowel by calling the helper method isVowel
                vowelCount++; // Increment the vowel count if the current character is a vowel
            }
        }
        return vowelCount; // Return the total count of vowels in the input string
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convert the character to lowercase to handle both uppercase and lowercase vowels
        // Check if the character is one of the vowels
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}


