package com.demo;

import java.util.*;

public class MimimumValue {


    public static void main(String[] args) {
        Integer array[] = {2, 3, 4, 5, 7, 9, 1, 3, 2, 7};

//        ArrayList<Integer> list=new ArrayList<>();
//        for (int output : array){
//            list.add(output);
//        }
//        System.out.println("Mimimum value from array is :"+ Collections.min(list));
//    }
        List<Integer> ls=Arrays.asList(array);
        Integer value = ls.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(value);

    }
}
