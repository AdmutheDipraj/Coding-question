package com.test;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter The Number");
       int num= scanner.nextInt();
        for (int i = 2; i < num ; i++) {
            if(num%i==0){
                count++;
                System.out.println();
            }
        }
        if (count==0){
            System.out.println("The Given Number is a prime Number");
        }else {
            System.out.println("The given Number is not prime Number");
        }
    }
}
