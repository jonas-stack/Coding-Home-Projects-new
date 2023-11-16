package ArrayExercises;


/*
Write a Java program to sum values of an array
 */

public class ArraySumValues {

    public static void exercise2() {
        // Declare and initialize an integer array.
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Declare and initialize a variable to store the sum.
        int sum = 0;

        // Iterate over each element of the array using an enhanced for loop.
        for (int i : my_array)
            // Add each element to the sum.
            sum += i;

        // Print the sum of the array elements.
        System.out.println("The sum is " + sum);
    }
}
