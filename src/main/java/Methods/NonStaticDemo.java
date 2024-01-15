package Methods;

public class NonStaticDemo {

    public int getsum(int a,int b){
        int d=a+b;
        System.out.println("The Given Sum is :"+d);
        return d;
    }
    public String getStringValue(String Value){
        String str="Dip";
        String str2="Raj";
        System.out.println(str.concat(str2));
        return str.concat(str2);
    }

    public String getStr(String name){
        return name;
    }

}
