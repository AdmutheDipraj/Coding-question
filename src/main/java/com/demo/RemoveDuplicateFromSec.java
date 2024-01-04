package com.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromSec {

    public static void main(String[] args) {
        String str1="dipraj";
        String str2="admuthe";

        char []ch1=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Set<Character> set=new LinkedHashSet<>();
        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i]==ch2[j]){
                    set.add(ch1[i]);
                }
            }
        }
        StringBuilder result=new StringBuilder();
        for (char ch:ch1){
            if (!set.contains(ch))
                result.append(ch);
        }
        System.out.println("Original String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Result after removal: " + result.toString());
    }
}
