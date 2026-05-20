package Java8.features.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Prc1 {
    public static void main(String[] args) {

        //how to create stream

        List<String> list = Arrays.asList("aaa","bbb","ccc");
        Stream<String> stream = list.stream();



        String[] st = {"aa","bb","cc","dd"};
        Stream<String> stream1 = Arrays.stream(st);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);


        Stream<Integer> iterate = Stream.iterate(1,x -> x + 1).limit(50);

    }
}
