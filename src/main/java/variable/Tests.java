package variable;

public class Tests {

    public Tests(int a){
        a=10;

        System.out.println(a);
    }

//    public int getValue(int a){
//       int b=10;
//        System.out.println(a);
//        return a;
//    }

    public static void main(String[] args) {
        Tests tests=new Tests(12);
        int l;
        System.out.println();
        System.out.println(tests.toString());
        //System.out.println(test.y);
        Test test=new Test();
        System.out.println(test.y);
        //System.out.println(Test.y);
       // System.out.println(Test.x);
        System.out.println(test.x);

    }
}
