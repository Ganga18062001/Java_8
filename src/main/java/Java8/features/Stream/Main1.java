package Java8.features.Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {

        long i = Stream.iterate(0, x -> x + 10)
                .limit(5)
                .skip(0)
                .map(x -> x / 2)
                //.peek(x -> System.out.print(x+" "))
                .distinct()
                //.max((a, b) -> b - a)
                //.get();
                        .count();

        System.out.println(i);

        List<Integer> list = Arrays.asList(1, 2, 3, 4,5);
        list.parallelStream();


    }
}
