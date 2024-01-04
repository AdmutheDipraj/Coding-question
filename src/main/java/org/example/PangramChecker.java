package org.example;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog";

       String result= checkPangram(str);
        System.out.println(result);
    }

    private static String checkPangram(String str) {
        Set<Character> set=new HashSet();
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
        }
       if (set.size()==26){
           return "Pangram Number";
       }
        return "Not PangramChecker";
    }
}
