package com.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {
    //How do you find the duplicate number on a given integer array?

    public static void main(String[] args) {

        int array[]={2,4,6,8,1,3,5,7,1,3,5,6,8};

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i]==array[j]){
                    System.out.println(array[j]);

                }

            }

        }

    }
}
