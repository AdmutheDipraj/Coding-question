package com.example;

import java.util.Arrays;

public class Anagram {


    private static void isAnagram(String str1, String str2) {
        //=str1.toLowerCase().toCharArray();
        str1.replaceAll("\\s"," ");
        str2.replaceAll("\\s"," ");
        boolean status=true;

        if (str1.length()!=str2.length()){
            status =false;
        }else {
            char ch[] = str1.toLowerCase().toCharArray();
            char ch1[] = str1.toLowerCase().toCharArray();

            Arrays.sort(ch);
            Arrays.sort(ch1);

            status = Arrays.equals(ch, ch1);
        }
        if (status){
            System.out.println("the given string is Anagram");
        }else {
            System.out.println("The given String is Not Anagram");
        }
    }


    public static void main(String[] args) {
     isAnagram("Mother In Law", "Hitler Woman");
    }


}
