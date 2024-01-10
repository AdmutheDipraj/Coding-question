package org.example;

import java.util.Scanner;

public class Example {

    //How to find all pairs of elements in an array whose sum is equal to given number
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Number is :");
        int num= scanner.nextInt();
        int array[]={2,4,7,1,3,5,9};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i]+array[j]==num){
                    System.out.println("The Given pair is :"+array[i]+"and"+array[j]);
                }
            }
        }
    }
}
