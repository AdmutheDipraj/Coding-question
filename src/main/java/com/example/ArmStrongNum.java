package com.example;

import java.util.Scanner;

public class ArmStrongNum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number :-");
        int num=scanner.nextInt();
        checkArmstrongNum(num);
        if (checkArmstrongNum(num)){
            System.out.println("The Given Number is ArmStrong Number");
        }else {
            System.out.println("The Given Number is Not ArmStrong Number");
        }
    }

    private static boolean checkArmstrongNum(int num) {
        int originalNum=num;
        int sum=0;
        while (num>0){
            int digit=num%10;
            sum+=(digit*digit*digit);
            num/=10;
        }

        return sum==originalNum;
    }
}
