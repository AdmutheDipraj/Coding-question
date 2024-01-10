package com.example;

public class SumOfArrays {

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,3,1,5,1};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
           sum =sum+array[i];
        }
        System.out.println("Sumation of given array is :"+sum);
    }
}
