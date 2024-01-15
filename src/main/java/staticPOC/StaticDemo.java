package staticPOC;

public class StaticDemo {

   static int a;
    static int b=10;
    public static void main(String[] args) {
        StaticDemo staticDemo=new StaticDemo();
        System.out.println("Value of b:"+b);

        System.out.println(a); //Direct Calling Methods

        System.out.println(StaticDemo.a);//using class Name Calling method
        System.out.println(StaticDemo.b);
        int value = StaticDemo.a;System.out.println(value);

        //object Calling methods
        int output = staticDemo.b;
        System.out.println(output);
        System.out.println(staticDemo.a);

    }
}
