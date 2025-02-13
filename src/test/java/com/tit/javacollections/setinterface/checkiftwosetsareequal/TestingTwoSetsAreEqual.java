package com.tit.javacollections.setinterface.checkiftwosetsareequal;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TestingTwoSetsAreEqual {
     @Test
    public void test(){

         Set<Integer> set1 = new HashSet<>();
         Set<Integer> set2 = new HashSet<>();

         set1.add(1);
         set1.add(2);
         set1.add(3);
         set1.add(4);
         set1.add(5);

         set2.add(1);
         set2.add(2);
         set2.add(3);
         set2.add(4);
         set2.add(5);

         boolean result = Check.check(set1,set2);
         boolean expext = true;

         assertEquals(expext,result);
         System.out.println("Test succesfully passed");

     }

}
