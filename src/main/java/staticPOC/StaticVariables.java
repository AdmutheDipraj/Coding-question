package staticPOC;

public class StaticVariables {

    static int a;

    static int b=10;

    public static void main(String[] args) {
        StaticVariables staticVariables=new StaticVariables();
        System.out.println(b);

        System.out.println(StaticVariables.a);

        System.out.println();

    }
}
