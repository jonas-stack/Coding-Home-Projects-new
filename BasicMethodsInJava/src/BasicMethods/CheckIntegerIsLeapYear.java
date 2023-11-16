package BasicMethods;

import java.util.Scanner;

/*
Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

Expected Output:

Input a year: 2017
false
 */

public class CheckIntegerIsLeapYear {

   public static void exercise10() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input a year: ");
       int year = scanner.nextInt();
       System.out.println(isLeapYear(year));
       scanner.close();
   }

   public static boolean isLeapYear(int year) {
       boolean isDivisibleBy4 = (year % 4) == 0;
       boolean isNotDivisibleBy100 = (year % 100) != 0;
       boolean isDivisibleBy400 = (year % 400) == 0;

       return isDivisibleBy4 && (isNotDivisibleBy100 || isDivisibleBy400);
   }
}


