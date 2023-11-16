package BasicMethods;


import java.util.Scanner;

/*
Write a Java method to compute the sum of digits in an integer.
Test Data:
Input an integer: 25
Expected Output:

The sum is 7
 */

public class SumOfDigitsInInteger {

    public static void exercise6() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer (THIS HAS TO BE A NUMBER STRING): ");
        int num = in.nextInt();
        System.out.println("The sum is " + sumOfDigits(num));
        in.close(); // Closing the Scanner
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // add the last digit
            num /= 10; // remove the last digit
        }
        return sum;
    }
}