package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class CountOcc {

    public static void main(String[] args) {
        int arr[]={3,1,4,5,2,4,7,5,2,7,9};

        Map<Integer,Long> occurance=countOccurance(arr);
        System.out.println(occurance);
        occurance.forEach((key,value)-> System.out.println(key+":"+value));
    }
    static Map<Integer, Long> countOccurance(int[] arr){

        return Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
    }

}
