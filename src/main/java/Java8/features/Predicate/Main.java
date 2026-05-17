package Java8.features.Predicate;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> pr1 = x -> x % 2 == 0;
        //System.out.println(pr1.test(1));

        BiPredicate<Integer,Integer> pr2 = (x,y) -> x%2 == 0 && y%2 == 0;
        System.out.println(pr2.test(4,0));

        Function<String,Integer> fun = x -> x.length();
       // System.out.println(fun.apply("Java"));
        BiFunction<String,String,Integer> fu = (x,y) -> x.length() + y.length();
        System.out.println(fu.apply("ab","bc"));

        Consumer<Integer> con = a -> System.out.println(a);
        con.accept(10);

        BiConsumer<Integer,Integer> con2 = (b,c) -> System.out.println(b+c);
        con2.accept(1,2);

        Supplier<String> s = ()-> "kmfd";
        System.out.println(s.get());
    }
}
