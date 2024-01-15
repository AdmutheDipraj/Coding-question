package staticPOC;

import variable.Demo;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticDemo.a);//Direct Calling

        StaticDemo staticDemo=new StaticDemo();
        System.out.println(staticDemo.a);
        System.out.println(staticDemo.b);

        Demo demo=new Demo();



    }
}
