package Methods;

public class StaticDemo {


    public static void getValue(){
        System.out.println("Hi");
    }
    public static int getValue(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;

    }
    public static String getValue(String value){

        return "Hi Im Dipraj";
    }
    public static void main(String[] args) {
      //  System.out.println(getValue(10,12));
        getValue(12,15);
        getValue();
        System.out.println(getValue("Hiiiii"));



    }
}
