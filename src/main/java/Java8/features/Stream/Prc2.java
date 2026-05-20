package Java8.features.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prc2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 45, 6, 8, 10);
//        List<Integer> collect = list.stream().filter(x -> x % 2 == 0)
//
//                //.peek(x -> System.out.println(x))
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

        Map<Boolean,List<Integer>> result = list.stream()
                .collect(Collectors.partitioningBy(x -> x%2==0));

        System.out.println("Even number");
        System.out.println(result.get(true));

        System.out.println("Odd numner");
        System.out.println(result.get(false));
    }
}
