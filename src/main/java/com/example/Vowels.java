package com.example;

public class Vowels {

    public static void main(String[] args) {
        String str="Hi Im Dipraj Admuthe";
        str=str.toLowerCase();
        String value = str.replaceAll("\\s", " ");
        System.out.println(value);

        char[] nameArray = value.toCharArray();
        char ch[]={'a','e','i','o','u'};
        int count = 0;
        for (int i = 0; i < ch.length; i++) {

            for (int j = 0; j < nameArray.length; j++) {
                if (ch[i]==nameArray[j]){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
