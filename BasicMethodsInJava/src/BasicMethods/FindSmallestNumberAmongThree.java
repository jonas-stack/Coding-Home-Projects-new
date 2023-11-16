package BasicMethods;

import java.util.Scanner;


// Write a Java method to find the smallest number among three numbers.
//Test Data:
//Input the first number: 25
//Input the Second number: 37
//Input the third number: 29
//Expected Output:
//
//The smallest value is 25.0
public class FindSmallestNumberAmongThree {

    public static void exercise1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = input.nextDouble();
        System.out.print("Input the Second number: ");
        double y = input.nextDouble();
        System.out.print("Input the third number: ");
        double z = input.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }

    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
}