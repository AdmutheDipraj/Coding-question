package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class findDuplicateNum {

    public static void main(String[] args) {
        Integer number[]={1,2,3,4,5,6,7,8,5,4,1,7};
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i < number.length; i++) {
            if (map.containsKey(number[i])){
                map.put(number[i],map.get(number[i])+1);
            }else {
                map.put(number[i],1);
            }

        }
        System.out.println("Arrays Numbers :"+":"+"Occurance of Numbers");
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()>1){

                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }




}
