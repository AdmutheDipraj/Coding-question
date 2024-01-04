package com.demo;

public class ReverseWord {

    public static void main(String[] args) {
        String str="radar";
        String reverseArray="";
        char nameArray[]=str.toCharArray();
        for (int i = 0; i < nameArray.length; i++) {
            reverseArray=nameArray[i]+reverseArray;

        }
        if(str.equals(reverseArray)){
            System.out.println("The given String is Palindrome");
        }else
        System.out.println("The given String is Not Palindrome");
    }
}
