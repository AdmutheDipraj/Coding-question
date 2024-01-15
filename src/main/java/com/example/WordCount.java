package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {

//    public static void main(String[] args) {
//
//    String paragraph = "This is a sample paragraph This paragraph contains sample text Text is important for testing";
//    paragraph=paragraph.toLowerCase();
//    String word[]= paragraph.split(" ");
//    //System.out.println(word.toString());
//    Map<String,Integer> map=new LinkedHashMap<>();
//    for (int i = 0; i < paragraph.length(); i++) {
//        if(map.containsKey(word[i])){
//            map.put(word[i],map.get(word[i])+1);
//        }else {
//            map.put(word[i],1);
//        }
//    }
//    for (Map.Entry<String,Integer> counds: map.entrySet()) {
//        if (counds.getValue()>=1){
//            System.out.println(counds.getKey()+":"+counds.getValue());
//        }
//    }
//
//}
        public static void main(String[] args) {
            String paragraph = "This is a sample paragraph. This paragraph contains sample text. Text is important for testing.";
            paragraph = paragraph.toLowerCase();
            String[] words = paragraph.split(" ");

            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < words.length; i++) {
                if (map.containsKey(words[i])) {
                    map.put(words[i], map.get(words[i]) + 1);
                } else {
                    map.put(words[i], 1);
                }
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }


}


