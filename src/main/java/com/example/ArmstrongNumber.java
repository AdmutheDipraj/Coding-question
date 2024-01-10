package com.example;

import java.util.Scanner;

public class ArmstrongNumber {

    private static boolean checkArmstrongNumber(int num) {
        int originalNum=num;
        int sum=0;
        while (num>0){
            int value=num%10;
            sum+=(value*value*value);
            num/=10;
        }
        return sum==originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number= scanner.nextInt();
        if (checkArmstrongNumber(number)){
            System.out.println("The given Number is ArmsStrongNumber :"+number);
        }else {
            System.out.println("The given Number is Not ArmsStrong Number :"+number);
        }
        scanner.close();
    }


}
