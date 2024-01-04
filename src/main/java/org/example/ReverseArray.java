package org.example;

public class ReverseArray {

    public static void main(String[] args) {
      //  String name="Ajay Kalpe";
//        char[] nameArray = name.toCharArray();
//        String reverse="";
//        for (int i = 0; i < nameArray.length; i++) {
//            reverse=nameArray[i]+reverse;
//        }
//        System.out.println(reverse);

        int array[]={2,4,6,8,2,4,5,1,7};
        int reverseNu=0;
        for (int i = 0; i < array.length; i++) {
            reverseNu= array[i]+reverseNu;
        }
        System.out.println(reverseNu);
    }
}
