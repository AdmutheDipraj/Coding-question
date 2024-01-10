package com.example;

public class SwapNumbers {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("The value of a :"+a+"The value of b :"+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The value of a :"+a+"The value of b :"+b);

    }
}
