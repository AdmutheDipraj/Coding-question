package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurance {

    public static void main(String[] args) {
        String str="Hi im Ajay Kalpe";
        Map<Character,Integer> map=new LinkedHashMap<>();
        String value = str.toLowerCase().replaceAll("\\s", " ");
       char [] nameArray= value.toCharArray();
        for (int i = 0; i < nameArray.length; i++) {
            if (map.containsKey(nameArray[i])){
                map.put(nameArray[i], map.get(nameArray[i])+1);
            }else {
                map.put(nameArray[i],1);
            }
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>=1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
