package com.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateNum {

    public static void main(String[] args) {
        Integer array[]={2,3,4,5,6,7,8,9,6,5,3,2,7,2,1,4,7};

        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }

        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }

        }

    }
}
