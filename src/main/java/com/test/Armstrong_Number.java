package com.test;

import java.util.Scanner;

public class Armstrong_Number {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scanner.nextInt();

        checkTheArmstrongNumber(num);
    }

    private static void checkTheArmstrongNumber(int number) {
        int sum=0;
        int original_number=number;

        while (number>0){
           int digit=number%10;

            sum+=(digit * digit * digit);

            number/=10;
        }
        if (original_number==sum){
            System.out.println("The Given Number is Armstrong Number");
        }else{
            System.out.println("The given Number is Not a Armstrong Number");
        }
    }
}
