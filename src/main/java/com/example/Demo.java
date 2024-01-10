package com.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {

    //count duplicate words from given sentence
    public static void main(String[] args) {
        String str="Hi Im Dipraj Admuthe";
        String str1 = str.toLowerCase().replaceAll("\\s", "");
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        char nameArray[]=str1.toCharArray();
        for (int i = 0; i < nameArray.length; i++) {
            if(map.containsKey(nameArray[i])){
                map.put(nameArray[i], map.get(nameArray[i])+1);
            }
            else {
                map.put(nameArray[i],1);
            }
        }
        for (Map.Entry<Character,Integer> mp:map.entrySet()) {
            if (mp.getValue()>1){
                System.out.println(mp.getKey()+":"+mp.getValue());
            }
        }
    }
}
