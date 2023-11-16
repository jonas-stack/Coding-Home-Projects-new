package BasicMethods;

import java.util.Scanner;

/*
 Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5

Expected Output:

Years    FutureValue
1            1104.71
2            1220.39
3            1348.18
4            1489.35
5            1645.31
 */

public class InterestRateOverYears {

    private static final double MONTHS_IN_YEAR = 12;
    private static final double PERCENTAGE_CONVERTER = 0.01;
    private static final int SHORT_FORMATTER_THRESHOLD = 10;
    private static final int LONG_FORMATTER_LENGTH = 19;
    private static final int SHORT_FORMATTER_LENGTH = 18;

    public static void exercise8() {
        // Create a new Scanner object to read input from the console
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the investment amount
        System.out.print("Input the investment amount: ");
        double investment = in.nextDouble(); // Read the investment amount

        // Prompt the user to input the rate of interest
        System.out.print("Input the rate of interest: ");
        double rate = in.nextDouble(); // Read the rate of interest

        // Prompt the user to input the number of years
        System.out.print("Input number of years: ");
        int year = in.nextInt(); // Read the number of years

        in.close(); // Closing the Scanner

        // Convert the rate of interest to a decimal value (divide by 100)
        rate *= PERCENTAGE_CONVERTER;

        // Print the header for the output
        System.out.println("Years    FutureValue");

        // Iterate through each year and calculate the future investment value
        for (int i = 1; i <= year; i++) {
            // Set the value of the formatter depending on the value of 'i'
            int formatter = LONG_FORMATTER_LENGTH;
            if (i >= SHORT_FORMATTER_THRESHOLD) {
                formatter = SHORT_FORMATTER_LENGTH;
            }

            // Print the year and the future investment value using the formatted output
            System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate / MONTHS_IN_YEAR, i));
        }
    }

    // Method to compute the future investment value
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        // Calculate the future value using the compound interest formula
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * MONTHS_IN_YEAR);
    }
}