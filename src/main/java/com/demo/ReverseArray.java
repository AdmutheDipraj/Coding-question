package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
        int array[]={2,3,4,5,6,7,8,9};

        List<Integer> list=new ArrayList<>();
        for (int value:array){
            list.add(value);
        }
        Collections.reverse(list);
        System.out.println(list);

        for (int output: list){
            System.out.println(output +" ");
        }

    }
}
