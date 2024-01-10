package com.demo;

import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Factorial factorial=new Factorial();
        System.out.println("Enter the Number");
        int number=scanner.nextInt();
        factorial.FactorOfNumber(number);

    }
    public int FactorOfNumber(int num){
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        System.out.println(fact);
        return fact;
    }


}
