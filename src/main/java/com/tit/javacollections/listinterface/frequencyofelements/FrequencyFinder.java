package com.tit.javacollections.listinterface.frequencyofelements;

import java.util.*;

// Creating a class FrequencyFinder to demonstrate counting frequency of elements
public class FrequencyFinder
{
    public static void main(String[] args) {
        // Creating an object of FrequencyCounter
        FrequencyCounter counter = new FrequencyCounter();

        // List of strings
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        // Counting frequency of elements
        Map<String, Integer> frequencyMap = counter.countFrequency(list);

        // Printing the frequency map
        System.out.println("Frequency of elements: " + frequencyMap);
    }
}