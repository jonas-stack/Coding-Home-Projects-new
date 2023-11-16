package ArrayListExercises;


import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */

public class ArrayListAddColoursAndPrintout {

    public static void exercise1(){
        List<String> list_colour = new ArrayList<>();
        list_colour.add("Red");
        list_colour.add("Green");
        list_colour.add("Orange");
        list_colour.add("White");
        list_colour.add("Black");

        System.out.println(list_colour);
    }
}
