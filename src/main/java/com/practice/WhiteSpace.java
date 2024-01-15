package com.practice;

public class WhiteSpace {

    public static void main(String[] args) {
        String str="Hi Im Dipraj Admuthe";

        String result=str.replaceAll("\\s","");

        System.out.println("The given input is :"+result);


    }
}
