package com.example;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=scanner.nextInt();
        factorialNumber(number);
    }

    private static void factorialNumber(int number) {
        int factorial=1;
        for (int i = 1; i <= number; i++) { //
            factorial=factorial*i;
        }
        System.out.println("The Given Factorial Number is :"+factorial);
    }
}
