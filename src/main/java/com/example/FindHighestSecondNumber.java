package com.example;

public class FindHighestSecondNumber {

    public static void main(String[] args) {
        int array[]={2,4,6,1,3,2,5,7,9,5,7};

        int max1=-1;
        int max2=-1;

        for (int i = 0; i < array.length; i++) {
            if(max1<array[i]){
                //max1=array[i];
                max1=Math.max(array[i],max1);
            }

        }
        System.out.println("The highest Value is :"+max1);

        for (int i = 0; i < array.length; i++) {
            if (max2<array[i] && max1!=array[i]){
               // max2=array[i];

                max2=Math.max(array[i],max2);
            }

        }
        System.out.println("The Secound Highest Number is :"+max2);
    }

}
