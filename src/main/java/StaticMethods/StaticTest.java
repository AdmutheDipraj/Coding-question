package StaticMethods;

public class StaticTest {

     public void test(){
         System.out.println("This is Non Static Method");
         demo();
     }

     public static void demo(){
         System.out.println("This is static methods");
         //test();
     }

    public static void main(String[] args) {
        StaticTest staticTest=new StaticTest();
        StaticTest.demo();
        staticTest.test();
        staticTest.demo();
    }
}
