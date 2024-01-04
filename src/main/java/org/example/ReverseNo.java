package org.example;

public class ReverseNo {

    public static void main(String[] args) {

        String str="dipraj";
        String value="";
        char[] ch = str.toCharArray();
        for (int i = str.length()-1; i >=0 ; i--) {
            value=value+ch[i];

        }
        System.out.println(value);


    }
}
