package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

    public static void main(String[] args) {

        Map<Character,Integer> map=new HashMap<>();
        String name="Ajay Kalpe";
        String value = name.replaceAll("\\s", "");
        System.out.println(value);
        char[] nameArray = value.toLowerCase().toCharArray();
        System.out.println(nameArray);

        for (int i = 0; i < nameArray.length; i++) {
            if (map.containsKey(nameArray[i])){
                map.put(nameArray[i],map.get(nameArray[i])+1);
            }else {
                map.put(nameArray[i],1);
            }
        }
        for (Map.Entry<Character,Integer> mp: map.entrySet()) {
          //  if (mp.getValue()>1){  //Its give the duplicate value
//              if (mp.getValue()>=1{ //Its give the all Occurance
                if (mp.getValue()==1){ //remove Duplicates Value
                System.out.println(mp.getKey()+":"+mp.getValue());
            }
        }

    }
}

