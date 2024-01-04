package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Singleton {
    private static Singleton singletonobj;
    private Singleton(){

    }
    //create on static method which return singleton object
    public static synchronized Singleton getSingletonObject(){
       if(singletonobj==null){
           singletonobj=new Singleton();
       }else {
           return singletonobj;
       }

        return singletonobj;
    }
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getSingletonObject();
        Singleton obj2 = Singleton.getSingletonObject();

        System.out.println("Obje1 :"+obj1.hashCode());
        System.out.println("Obje2 :"+obj2.hashCode());
    }
}