package ArrayExercises;

/*
Write a Java program to print the following grid.
 */

public class ArrayGridPrint {

    public static void exercise3() {
        // Declare gridArray two-dimensional integer array 'gridArray' with dimensions 10x10.
        int[][] gridArray = new int[10][10];

        // Use nested loops to iterate over each row and column of the array.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Print each element of the array, ensuring gridArray minimum width of 2 characters.
                System.out.printf("%2d ", gridArray[i][j]);
            }
            // Move to the next line to represent gridArray new row in the output.
            System.out.println();
        }
    }
}
