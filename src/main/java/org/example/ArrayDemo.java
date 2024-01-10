package org.example;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class ArrayDemo {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(1);

        System.out.println(removeDuplicates(list));

    }
    private static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> result=new LinkedHashSet<>();
        for (Integer value:list) {
            result.add(value);
        }
        System.out.println(result);

        return list;
    }
}
