package com.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicates {

    public static void main(String[] args) {
        String str="Java is good Programming langauge";
        String value = str.replaceAll("\\s", "");
        char[] nameArray = value.toLowerCase().toCharArray();
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i < nameArray.length; i++) {
           if(map.containsKey(nameArray[i])){
               map.put(nameArray[i],map.get(nameArray[i])+1);
           }else {
               map.put(nameArray[i],1);
           }

        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
