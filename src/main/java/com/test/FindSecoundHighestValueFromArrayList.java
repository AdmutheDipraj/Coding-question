package com.test;

public class FindSecoundHighestValueFromArrayList {

    public static void main(String[] args) {
        int array[]={1,3,5,8,3,2,7,1,12,4,9};

        int max1=-1;
        int max2=-1;
        for (int i = 0; i < array.length; i++) {

            if (max1<array[i]){
                max1=Math.max(array[i],max1);
            }


        }
        System.out.println(max1);
        for (int i = 0; i < array.length; i++) {
            if (max2<array[i] && max1!=array[i]){
                max2=Math.max(array[i],max2);
            }

        }
        System.out.println("The Highest Secound Value be the :"+max2);

    }
}
