public class TryingTheBasics {

    static int num1 = 10;
    static int num2 = 20;

    static double num3 = 3.333;
    static  double num4 = 4.444;

    static int myInteger = 42;
    static double myDouble = 3.12345;
    static String myString = "Hello World";
    static boolean myBoolean = true;


    public static void main(String[] args) {

        System.out.println("Integer: " + myInteger);
        System.out.println("Double: " + myDouble);
        System.out.println("String: " + myString);
        System.out.println("Boolean:" + myBoolean);
        System.out.println(myInteger + "," + myDouble + "," + myBoolean + "," + myString);

        calculationAddition();
        calculationSubtraction();
        calculationMultiplication();
        calculationDivision();
        isNumberOddOrEven();
    }

    private static void calculationAddition(){
        int sum1 = num1 + num2;
        double sum2 = num3 + num4;
        double sum3 = myDouble + num3 + num4 + num1 + num2 + myInteger;
        double sum4 = myDouble + sum1 + sum2 + sum3 + myInteger;

        System.out.println("Sum"+ sum1);
        System.out.println("Sum"+ sum2);
        System.out.println("Total Sum " + sum3);
        System.out.println("Total Sum " + sum4);
    }

    private static void calculationSubtraction(){
        int sum1 = num1 - num2;
        double sum2 = num3 - num4;
        double sum3 = myDouble - num3 - num4 - num1 - num2 - myInteger;
        double sum4 = myDouble - sum1 - sum2 - sum3 - myInteger;
        System.out.println("Sum"+ sum1);
        System.out.println("Sum"+ sum2);
        System.out.println("Total Sum " + sum3);
        System.out.println("Total Sum " + sum4);
    }


    private static void calculationMultiplication(){
        int sum1 = num1 * num2;
        double sum2 = num3 * num4;
        double sum3 = myDouble * num3 * num4 * num1 * num2 * myInteger;
        double sum4 = myDouble * sum1 * sum2 * sum3 * myInteger;
        System.out.println("Sum"+ sum1);
        System.out.println("Sum"+ sum2);
        System.out.println("Total Sum " + sum3);
        System.out.println("Total Sum " + sum4);
    }

    private static void calculationDivision(){ //something is wrong here
        double sum1 = (double) num1 / num2;//cast to double because the original variable is an int so i get 0.5 and not 0
        double sum2 = num3 / num4;
        double sum3 = myDouble / num3 / num4 / num1 / num2 / myInteger;
        double sum4 = myDouble / sum1 / sum2 / sum3 / myInteger;

        System.out.println("Sum1" + " " + sum1);
        System.out.println("Sum2" + " " + sum2);
        System.out.println("Total Sum1" + " " + sum3);
        System.out.println("Total Sum2" + " " + sum4);
    }

    private  static void isNumberOddOrEven(){
        double sum1 = num1;
        double sum2 = num2;
        double sum3 = myDouble / num3 / num4 / num1 / num2 / myInteger;

        if (sum1 % 2 == 0){
            System.out.println(sum1 + " is even ");
        }
        if (sum2 % 2 == 0){
            System.out.println(sum2 + " is even ");
        }
        if (sum3 % 2 == 0){
            System.out.println(sum3 + " is even ");
        }
        else {
            System.out.println(sum1 + sum2 + sum3 + " is odd ");
        }
    }
}
