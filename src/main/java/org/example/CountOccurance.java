package org.example;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurance {

    public static <Charater> void main(String[] args) {
        String str="diprajadmuthe";

        Map<Character,Integer> occurance=new HashMap<>();
        char[] numarray = str.toCharArray();

        for (int i = 0; i < numarray.length; i++) {
            if (occurance.containsKey(numarray[i])){
                occurance.put(numarray[i],numarray[i]+1);
            }else {
                occurance.put(numarray[i],1);
            }
        }

        for (Map.Entry map: occurance.entrySet()) {
            System.out.println(map.getKey()+":"+map.getValue());
        }


    }

}
