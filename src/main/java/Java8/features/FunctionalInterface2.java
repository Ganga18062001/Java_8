package Java8.features;

import java.util.function.Function;

public class FunctionalInterface2 {
    public static void main(String[] args) {
        Function<Integer,Integer> mul = x -> 2 * x;
        Function<Integer,Integer> mul2 = x -> x * x * x;

        System.out.println(mul.andThen(mul2).apply(3));//216
        System.out.println(mul2.andThen(mul).apply(3));//54

        System.out.println(mul.compose(mul2).apply(3));//54

        Function<Boolean , Boolean> identyFunc = Function.identity();
        System.out.println(identyFunc.apply(false));




    }
}
