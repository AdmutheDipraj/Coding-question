package com.demo;

public class PairOfSum {

    public static void main(String[] args) {


        int array[] = {2, 3, 4, 6, 8, 8, 3, 5, 1, 3, 7};
        int sumOfArray = 10;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i] + array[j]==sumOfArray){
                    System.out.println("The Pair of array is :"+array[i] +" :"+array[j]);
                }
            }

        }

    }
}
