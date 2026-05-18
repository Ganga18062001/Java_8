package Java8.features.urinaryAndBinnaryOper;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Function<Integer,Integer> fun = n -> n * n;
       // System.out.println(fun.apply(10));

        UnaryOperator<Integer> un = n -> n+n;
        System.out.println(un.apply(2));

        UnaryOperator<String> up = b -> b.toLowerCase();
        System.out.println(up.apply("abcdee"));

        BiFunction<String,String,String> bf = (x,y) -> x + y;
        System.out.println(bf.apply("ab","cd"));

        BinaryOperator<String> bn = (str1 ,str2) -> str1+str2;
        System.out.println(bn.apply("mn","df"));




    }
}
