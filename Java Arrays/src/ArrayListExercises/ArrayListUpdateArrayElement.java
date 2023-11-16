package ArrayListExercises;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to update an array element by the given element.
 */

public class ArrayListUpdateArrayElement {

    public static void exercise5(){
        // Create a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        // Print the list
        System.out.println(list_Strings);
        // Update the third element with "Yellow"

        list_Strings.set(2, "Yellow"); //updates element on index 2 to "yellow" in this example orange becomes yellow
        // Print the list again
        System.out.println(list_Strings);
    }
}
