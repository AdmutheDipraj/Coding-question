package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Integer array[]={5,3,1,11,16,20};

        List<Integer> ls=Arrays.asList(array);

        Integer output = ls.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(output);




    }
}
