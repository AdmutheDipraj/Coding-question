package StaticMethods;

public class StaticDemo {

    int a=5;
    static int b=7;

    public static void main(String[] args) {
        StaticDemo staticDemo=new StaticDemo();

        System.out.println("NonStatic:"+staticDemo.a++);
        System.out.println("Static:"+StaticDemo.b++);
        StaticDemo staticDemo1=new StaticDemo();
        System.out.println("NonStatic:"+staticDemo1.a++);
        System.out.println("Static:"+staticDemo1.b++);
        StaticDemo staticDemo2=new StaticDemo();
        System.out.println("NonStatic:"+staticDemo2.a++);
        System.out.println("Static:"+staticDemo2.b++);
        StaticDemo staticDemo3=new StaticDemo();
        System.out.println("NonStatic:"+staticDemo3.a++);
        System.out.println("Static:"+staticDemo3.b++);

    }
}
