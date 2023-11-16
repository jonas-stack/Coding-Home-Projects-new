package ArrayListExercises;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to insert an element into the array list at the first position.
 */
public class ArrayListInsertElementIntoIndex {

    public static void exercise3(){

        // Creates a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");//pos1
        list_Strings.add("Green");//pos2
        list_Strings.add("Orange");//pos3
        list_Strings.add("White");//pos4
        list_Strings.add("Black");//pos6

        // Print the list
        System.out.println(list_Strings);

        // Now insert a color at the first and last position of the list
        list_Strings.add(0, "Pink");//pos0
        list_Strings.add(5, "Yellow");//pos5
        list_Strings.add(7,"Blue");//pos7

        // Print the list
        System.out.println(list_Strings);
    }
}