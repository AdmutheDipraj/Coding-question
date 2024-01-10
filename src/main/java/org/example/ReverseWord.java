package org.example;

public class ReverseWord {

    public static void main(String[] args) {

        String str="Hi Im Dipraj Admuthe And Im Java developer";
        String word[]=str.split(" ");
        String reverse="";
        for (int i = 0; i < word.length; i++) {
            reverse=word[i]+reverse;
        }

        System.out.println(reverse);
    }
}
