package com.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str="Dipraj Admuthe";
        String value=str.replaceAll("\\s","");
        char[] numArray=value.toLowerCase().toCharArray();
        System.out.println(numArray);
        Set<Character> set=new LinkedHashSet<>();
        for (int i = 0; i < numArray.length; i++) {
            set.add(numArray[i]);
        }
        Iterator<Character> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
