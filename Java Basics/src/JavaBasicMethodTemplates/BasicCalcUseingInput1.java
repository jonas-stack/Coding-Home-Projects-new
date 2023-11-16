package JavaBasicMethodTemplates;

import java.util.Scanner;

public class BasicCalcUseingInput1 {

    public static void exercise5(){

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();


        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}
