package com.demo;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

    public static void main(String[] args) {
        String str="Hi Im Dipraj Admuthe";
        str=str.replaceAll("\\s","").toLowerCase();
        System.out.println(str);
        char numarray[]=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < numarray.length; i++) {
            if (map.containsKey(numarray[i])){
                map.put(numarray[i],map.get(numarray[i])+1);
            }else {
                map.put(numarray[i],1);
            }
        }
        for (Map.Entry<Character,Integer> mp: map.entrySet()){
            if (mp.getValue()>1){
                System.out.println(mp.getKey()+":"+mp.getValue());
            }
        }
    }
}
