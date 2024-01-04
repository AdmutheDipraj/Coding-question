package org.example;

public class PallindromeNumber {

    public static int checkPallindromeNumber(int num){
        int revereseNum=0;
        int temporiginal=num;
        while (temporiginal>0){
            int value=temporiginal%10;
            int reverseNum=revereseNum*10 + value;

        }
        return num;
    }

//
    public static void main(String[] args) {

        PallindromeNumber.checkPallindromeNumber(12321);

    }
}
