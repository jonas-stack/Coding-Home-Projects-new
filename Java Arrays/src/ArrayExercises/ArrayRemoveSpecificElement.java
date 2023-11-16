package ArrayExercises;

import java.util.Arrays;

/*
Write a Java program to remove a specific element from an array.
 */

public class ArrayRemoveSpecificElement {

    public static void exercise7(){
    // Declare and initialize an integer array 'my_array'.
    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(my_array);

    // Print the original array using Arrays.toString() method.
        System.out.println("Original Array : " + Arrays.toString(my_array));

    // Define the index of the element to be removed (second element, index 4 = value 36).
    int removeIndex = 1;

    // Loop to remove the element at the specified index.
        for (int i = removeIndex; i < my_array.length - 1; i++) {
        my_array[i] = my_array[i + 1];
    }

    // Print the modified array after removing the second element.
        System.out.println("After removing the second element: " + Arrays.toString(my_array));
    }
}
