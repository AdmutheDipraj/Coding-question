package com.test;

public class SumOfArryList {

    public static void main(String[] args) {
        int array[]={1,3,5,7,2,4,6,9,2};

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("The Sum of Given Array is :"+sum);
    }
}
