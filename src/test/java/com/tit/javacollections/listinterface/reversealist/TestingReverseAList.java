package com.tit.javacollections.listinterface.reversealist;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestingReverseAList
{

   @Test
   public void testReverseArrayList(){

      List<Integer> l = new ArrayList<>();
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(4);
      l.add(5);
      List<Integer> expected=new ArrayList<>(Arrays.asList(5,4,3,2,1));
      assertEquals(expected,ReverseAList.reverseArrayList(l));
      System.out.println("ArrayList reversal successfully passed");
   }

   @Test
   public void testReverseLinkedLst(){

      LinkedList<Integer> ll = new LinkedList<>();
      ll.add(1);
      ll.add(2);
      ll.add(3);
      ll.add(4);
      ll.add(5);
      LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(5,4,3,2,1));
      assertEquals(expected,ReverseAList.reverseLinkedList(ll));
      System.out.println("LinkedList reversal successsfully passsed");

   }

}
