package com.demo;

public class WordCount {

    public static void main(String[] args) {
        String str="Write a program to count a number of words in a given String";
        int count = countWords(str);
        System.out.println("Numbers of words in given length is :"+count);
    }

    public static int countWords(String str)
    {
        if (str==null || str.trim().isEmpty()){
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }
}
