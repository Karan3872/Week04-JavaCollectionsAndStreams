package com.tit.javacollections.listinterface.frequencyofelements;


import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestingFrequencyFinder {

    @Test
    public void testingFrequencyOfElements(){

        List<String> l = Arrays.asList("apple","banana","mango","apple");

        Map<String,Integer> expext = new HashMap<>();

        expext.put("apple",2);
        expext.put("banana",1);
        expext.put("mango",1);

        Map<String ,Integer> frequency = FrequencyOfElements.frequency(l);

        assertEquals(expext,frequency);
        System.out.println("Test successfully passsed");

    }

}
