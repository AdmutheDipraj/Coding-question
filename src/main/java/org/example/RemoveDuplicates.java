package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String name="Dipraj Admuthe";
        String value=name.replaceAll("\\s","");
       char [] numArray=value.toLowerCase().toCharArray();
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
