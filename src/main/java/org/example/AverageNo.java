package org.example;

public class AverageNo {

    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6,7,4};

        int sum=0;

        for (int i = 0; i < arr.length; i++) {
           sum=sum+arr[i];
        }

        int avg=sum/arr.length;
        System.out.println(avg);

        System.out.println(sum);
    }


}
