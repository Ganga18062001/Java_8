package Java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePrc {
    public static void main(String[] args) {
//        Predicate<Integer> isEven = (x)->x%2==0;
//
//        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);
//
//        for(Integer i : li){
//            if(isEven.test(i)){
//                System.out.println(i);
//            }
//        }

//        Predicate<String> startWithV = x -> x.toLowerCase().charAt(0)=='v';
//        Predicate<String> endwithL = y -> y.toLowerCase().charAt(y.length()-1)=='k';
//        Predicate<String> and = startWithV.or(endwithL);
//        System.out.println(and.test("viven"));

        //test();
        Predicate<Integer> p = n -> n%2 == 0;
        System.out.println(p.test(4));

        ///and

        Predicate<Integer> p1 = n -> n > 10;
        Predicate<Integer> p2 = n -> n % 2 == 0;

        System.out.println(p1.and(p2).test(10));

        //isEqual

        Predicate<String> p4 = Predicate.isEqual("Java");
        System.out.println(p4.test("java"));

    }
}
