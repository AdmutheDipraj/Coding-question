package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateNumber {
    public static void main(String[] args) {

        int array[]={2,3,4,6,8,1,3,4,7,4,2,7};
        Map<Integer,Integer> map=new LinkedHashMap<>();

        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
               map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> mp: map.entrySet()){
            if(mp.getValue()>1){
                System.out.println(mp.getKey()+":"+mp.getValue());
            }
        }

    }
}
