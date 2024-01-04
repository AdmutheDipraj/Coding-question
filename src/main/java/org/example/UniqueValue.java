package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueValue {
    public static void main(String[] args) {
        int a[]={1,2,3,4,1,2,3};
        Set duplicate =new HashSet();

        Set unique=new HashSet();

        for (int i:
             a) {
         if(!unique.add(i)){
             //System.out.println(i);
             duplicate.add(i);
             //System.out.println(i);
         }


        }
        unique.removeAll(duplicate);
        System.out.println(unique);
        Iterator itr= unique.iterator();
        int b=0;
        while (itr.hasNext()){
           // System.out.println(itr.next());
            b=(int)itr.next();

        }
        System.out.println(b);
    }
}
