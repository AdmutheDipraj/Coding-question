package Methods;

public class Test {

    public static void main(String[] args) {
        StaticDemo staticDemo=new StaticDemo();

        String value = StaticDemo.getValue("");
        System.out.println(value);


        /////////////////////////////////////////////////////
        NonStaticDemo nonStaticDemo=new NonStaticDemo();
        //nonStaticDemo.getsum(15,10);
       String values=nonStaticDemo.getStr("Ram");

        System.out.println(values);


       // nonStaticDemo.getStringValue("Ram");

    }
}
