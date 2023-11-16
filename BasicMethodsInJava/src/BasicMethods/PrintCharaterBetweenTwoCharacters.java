package BasicMethods;

/*
Write a Java method to print characters between two characters (i.e. A to P).
Note: Prints 20 characters per line

Expected Output:

( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
< = > ? @ A B C D E F G H I J K L M N O
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
d e f g h i j k l m n o p q r s t u v w
x y z
 */

public class PrintCharaterBetweenTwoCharacters {
    public static void exercise9(char startChar, char endChar, int charactersPerLine) {
        int charactersInLine = 0; // Counter for tracking the number of characters per line
        for (int count = 0; startChar <= endChar; count++, startChar++) {
            System.out.print(startChar + " ");
            charactersInLine++; // Increment the counter for each character printed
            if (charactersInLine % charactersPerLine == 0) {
                System.out.println(""); // Move to the next line after the specified number of characters
            }
        }
        System.out.print("\n"); // Adding a new line at the end
    }
}
