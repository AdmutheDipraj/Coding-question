package com.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesValueFromList {

    public static void main(String[] args) {
        Integer array[]={1,3,5,8,0,6,2,5,1,2,4,6,8,1,4,9};

        List<Integer> ls = Arrays.asList(array);
        Set<Integer> duplicateNum=new LinkedHashSet<>();
        List<Integer> output = ls.stream().filter(e -> duplicateNum.add(e)).collect(Collectors.toList());
        System.out.println(output);
    }
}
