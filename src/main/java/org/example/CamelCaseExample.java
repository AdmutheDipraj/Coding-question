package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CamelCaseExample {

    public static void main(String[] args) {
        String str = "dipraj_admuthe";
        String reverseword="";
        char[] reverse = str.toCharArray();
        for (int i = 0; i < reverse.length; i++) {
            reverseword=reverse[i]+reverseword;
        }
        System.out.println(reverseword);

    }
}
