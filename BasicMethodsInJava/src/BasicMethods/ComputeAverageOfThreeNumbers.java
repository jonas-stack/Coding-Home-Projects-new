package BasicMethods;

import java.util.Scanner;


/* Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
*/
public class ComputeAverageOfThreeNumbers {

    public static void exercise2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = input.nextDouble();
        System.out.print("Input the Second number: ");
        double y = input.nextDouble();
        System.out.print("Input the third number: ");
        double z = input.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}
