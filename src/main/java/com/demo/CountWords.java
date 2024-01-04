package com.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class CountWords {

    public static void main(String[] args) {

        String str="programming";
        char ch[]=str.toCharArray();
        Set<Character> uniqueword=new LinkedHashSet<>();

        for (int i = 0; i < ch.length; i++) {
            uniqueword.add(ch[i]);
        }
        int output = uniqueword.size();
        System.out.println("the count of given word is :"+output);
        //System.out.println("count unique word from the list :"+uniqueword);

    }
}
