package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueValuesExample {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 1, 2, 3};

        // Create a Set to store unique values
        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicateValues = new HashSet<>();

        // Iterate through the array and add each element to the set
        for (int i : a) {
            if (!uniqueValues.add(i)) {//1,2,3,4
                // If the element already exists in the set, it's a duplicate
                duplicateValues.add(i);
            }
        }

        // Remove duplicate values from uniqueValues set
        uniqueValues.removeAll(duplicateValues);

        // Print the unique values
        System.out.println("Unique values in the array are: " + uniqueValues);
    }



}
