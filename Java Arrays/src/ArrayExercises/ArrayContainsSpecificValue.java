package ArrayExercises;

/*
Write a Java program to test if an array contains a specific value.
 */

public class ArrayContainsSpecificValue {

    // The main method where the program execution starts.
    public static void exercise5() {
        // Declare an integer array 'my_array1' and initialize it with values.
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        // Check if the integer array 'my_array1' contains the item 2013 and print the result.
        System.out.println(contains(my_array1, 2013));

        // Check if the integer array 'my_array1' contains the item 2015 and print the result.
        System.out.println(contains(my_array1, 2015));
    }

        // Method 'contains' checks if an integer array 'arr' contains a given 'item'.
        public static boolean contains(int[] arr, int item) {
            // Iterate through each index 'i' in the array 'arr'.
            for (int i = 0; i < arr.length; i++) {
                // Check if 'item' is equal to the current element 'arr[i]'.
                if (item == arr[i]) {
                    // If a match is found, return 'true'.
                    return true;
                }
            }
            // If no match is found, return 'false'.
            return false;
        }
    }