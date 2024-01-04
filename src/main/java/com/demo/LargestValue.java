package com.demo;

import java.util.*;

public class LargestValue {

    //How do you find the largest and smallest number in an unsorted integer array
    public static void main(String[] args) {
        int array[]={2,4,6,8,3,5,7,3,2,8,4,9};

        ArrayList<Integer>  list=new ArrayList<Integer>();
        for(int value:array){
            list.add(value);
        }
        Integer output = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
       // System.out.println("Maximum Value of arraylist is :"+Collections.max(list));
    }
}
