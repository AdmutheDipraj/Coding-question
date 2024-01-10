package com.example;

public class ReverseString {

    public static void main(String[] args) {
        String str="Rahul";
        String reverse="";

        char nameArray[]=str.toCharArray();
        for (int i = 0; i < nameArray.length; i++) {
           reverse=nameArray[i]+reverse;

        }
        System.out.println(reverse);
    }
}
