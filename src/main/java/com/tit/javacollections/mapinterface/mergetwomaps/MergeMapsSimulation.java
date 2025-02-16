package com.tit.javacollections.mapinterface.mergetwomaps;

import java.util.*;

// Creating a class MergeMapsSimulation to demonstrate merging two maps
public class MergeMapsSimulation {
    public static void main(String[] args) {
        // Creating two maps with test data
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        // Creating an object of MergeMaps
        MergeMaps mergeMaps = new MergeMaps();

        // Merging the maps and printing the result
        Map<String, Integer> mergedMap = mergeMaps.merge(map1, map2);
        System.out.println("Merged map: " + mergedMap);
    }
}
