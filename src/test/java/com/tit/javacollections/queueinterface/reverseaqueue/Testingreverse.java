package com.tit.javacollections.queueinterface.reverseaqueue;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Testingreverse {

    @Test
    public void testReverse(){

      Queue<Integer> queue = new ArrayDeque<>();
      queue.add(8);
        queue.add(7);
        queue.add(6);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        Queue<Integer> expext = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6,7,8));
        assertEquals(Reverse.reverse(queue), queue);
        System.out.println("Test successfully passed");

    }

}
