package com.demo;

public class Practice {

    public static void main(String[] args) {
        String s1="ABC";
       // s1="PQR";
        String s2=new String("ABC");
        String s3="ABC";

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
    }
}
