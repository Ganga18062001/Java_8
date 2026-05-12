package Java8.features;

interface Add {
    int sum(int a,int b);
}
public class LambadaExpression {
    public static void main(String[] args) {
        Add obj = ( a, b)->{
            return a+b;
        };

        int result = obj.sum(10,20);
        System.out.println(result);

    }
}
