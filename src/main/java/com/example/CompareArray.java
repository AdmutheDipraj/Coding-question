package com.example;

import java.util.Arrays;

public class CompareArray {

    public static void main(String[] args) {
        int array1[]={2,4,6,8,10};

        int array2[]={8,6,4,2,10};

        Arrays.sort(array1);
        Arrays.sort(array1);

        System.out.println(Arrays.equals(array1,array2));
    }
}
