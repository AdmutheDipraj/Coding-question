package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FindSecHighestValueFromList {

    public static void main(String[] args) {
        Integer array[]={2,5,8,2,5,9,2,4,8,11,4,9};

        List<Integer> ls = Arrays.asList(array);
        Integer output = ls.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();

        System.out.println("The Secound Highest value will be :"+output);
    }
}
