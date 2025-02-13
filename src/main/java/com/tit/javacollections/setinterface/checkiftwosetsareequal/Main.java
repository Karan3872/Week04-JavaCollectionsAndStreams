package com.tit.javacollections.setinterface.checkiftwosetsareequal;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(5);
        set2.add(4);
        set1.add(3);
        set1.add(2);
        set1.add(1);

        System.out.println(Check.check(set2,set1));


    }

}
