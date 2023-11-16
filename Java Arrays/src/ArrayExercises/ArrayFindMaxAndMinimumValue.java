package ArrayExercises;

import java.util.Arrays;



public class ArrayFindMaxAndMinimumValue {

    // Define a method to calculate the maximum and minimum values in the array.
    public static void max_min(int my_array[]) {

        // Check if the array is empty and return if so
        if (my_array.length == 0) {
            return;
        }

        // Sort the array to easily find the minimum and maximum values
        Arrays.sort(my_array);
        int min = my_array[0]; // Get the minimum value
        int max = my_array[my_array.length - 1]; // Get the maximum value

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(my_array));
        // Print the maximum and minimum values
        System.out.println("Maximum value for the above array = " + max);
        System.out.println("Minimum value for the above array = " + min);
    }

    // The main method where the program execution starts.
    public static void exercise10() {
        // Initialize an example array
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // Call the method to find the maximum and minimum values
        max_min(myArray);
    }
}
