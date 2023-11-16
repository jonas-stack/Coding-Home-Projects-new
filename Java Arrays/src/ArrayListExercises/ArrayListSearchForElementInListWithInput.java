package ArrayListExercises;

/*
Write a Java program to search for an element in an array list.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSearchForElementInListWithInput {

    public static void exercise7(){

        // Create a list and add some colors to the list
        List<String> colorList = new ArrayList<String>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("White");
        colorList.add("Black");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the element to search
        System.out.print("Enter the color to search: ");
        String userInput = scanner.nextLine();

        // Convert the user input and list elements to lowercase for case-insensitive comparison
        String lowercaseInput = userInput.toLowerCase();
        List<String> lowercaseColorList = new ArrayList<>();

        /*
        for (String color : colorList): This part initiates a for-each loop that iterates through each element in the colorList list.
        The variable color represents the current element in each iteration.
         */
        for (String color : colorList) {//
            lowercaseColorList.add(color.toLowerCase());
        }

        // Search for the user-provided input
        if (lowercaseColorList.contains(lowercaseInput)) {
            // Print the element found
            System.out.println("Found the color: " + colorList.get(lowercaseColorList.indexOf(lowercaseInput)));
        } else {
            System.out.println("The color was not found in the list");
        }

        // Close the Scanner
        scanner.close();
    }
}
