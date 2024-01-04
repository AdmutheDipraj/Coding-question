package org.example;

public class AvgNo {

    public static void main(String[] args) {
     int array[]={2,4,6,8,1,3,5,8,6,3};
     int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+ array[i];

        }
        double avg=sum/ array.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
