package com.demo;

public class findSecoundMimimumValue {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, -10, 6, 2, 7, 9};
        int min1=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            min1=Math.min(array[i],min1);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]!=min1){
                Math.min(array[i],min2 );
            }

        }
        System.out.println("the value of secound lowest value :"+min2);
    }

//        public static void main(String[] args) {
//            int array[] = {1, 2, 3, -10, 6, 2, 7, 9};
//
//            int max1 = Integer.MIN_VALUE;
//            int max2 = Integer.MIN_VALUE;
//            int min1 = Integer.MAX_VALUE;
//            int min2 = Integer.MAX_VALUE;
//
//            for (int i = 0; i < array.length; i++) {
//                max1 = Math.max(array[i], max1);
//                min1 = Math.min(array[i], min1);
//            }
//
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] != max1) {
//                    max2 = Math.max(array[i], max2);
//                }
//                if (array[i] != min1) {
//                    min2 = Math.min(array[i], min2);
//                }
//            }
//
//            System.out.println("Second Maximum: " + max2);
//            System.out.println("Second Minimum: " + min2);
//        }


}
