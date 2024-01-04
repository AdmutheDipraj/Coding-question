package org.example;

public class SumOfArray {

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,3,2,4};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum= sum+i;

        }
        System.out.println("Sum of array is :"+sum);
    }
}
