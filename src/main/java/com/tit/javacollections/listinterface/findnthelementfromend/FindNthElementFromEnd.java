package com.tit.javacollections.listinterface.findnthelementfromend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNthElementFromEnd {
    public static void main(String[] args) {
        // Sample array of integers
        Integer[] array = {8, 4, 7, 9, 6, 3, 4, 5};

        // Create an ArrayList from the array
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        // Find the 3rd element from the end of the list
        int element = FindNthElement.findNthElement(arrayList, 5);

        // Print the found element
        System.out.println(element);
    }
}
