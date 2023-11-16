package ArrayExercises;

/*
Write a Java program to find the index of an array element.
 */

public class ArrayFindIndexOfArrayElement {

        public static void exercise6() {
            // Declare an integer array 'numbers' and initialize it with values.
            int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

            // Find and print the index position of value 25 in the array.
            System.out.println("Index position of 25 is: " + findIndexPosition(numbers, 25));

            // Find and print the index position of value 77 in the array.
            System.out.println("Index position of 77 is: " + findIndexPosition(numbers, 49));
        }

        // Define a method 'findIndexPosition' that searches for an integer 'target' in an integer array 'arr'.
        public static int findIndexPosition(int[] arr, int target) {
            // Check if the array is null and return -1 if it is.
            if (arr == null)
                return -1;

            // Get the length of the array.
            int length = arr.length;
            int index = 0;

            // Iterate through the elements in the array.
            while (index < length) {
                // Check if the current element is equal to 'target' and return its index if found.
                if (arr[index] == target)
                    return index;
                else
                    index = index + 1;
            }

            // If 'target' is not found in the array, return -1.
            return -1;
        }
}
