package Java8.features.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        int[] array = {1,2,3,4,5,6};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//
//            if(array[i] % 2 == 0){
//
//                sum += array[i];
//            }
//
//        }
//        System.out.println(sum);

        int[] arr2 = {1,2,3,4,5,6};
        //int sum2 = Arrays.stream(arr2).filter(n -> n%2 == 0).sum();
        //System.out.println(sum2);

//        List<String> list = Arrays.asList("apple","banana","cherry");
//        Stream<String> str = list.stream();
//        System.out.println(str);

//        int[] score = {1,2,3,4,5};
//        IntStream stream = Arrays.stream(score);
//        stream.forEach(System.out::print);

        Stream<Integer> inStream = Stream.of(1,2,3,4);
        //System.out.println(inStream.count());

        Stream<Integer> iterate = Stream.iterate(0, n -> n + 1).limit(100);
//        System.out.println(iterate);

        Stream<Integer> limit1 = Stream.generate(() ->(int)(Math.random() * 100)).limit(10);
        //limit1.forEach(System.out :: println);

        List<Integer> li = Arrays.asList(10,20,30,40,50,60,70);
        List<Integer> collect = li.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
       // System.out.println(collect);

        List<Integer> check = li.stream().map(x -> x / 2).collect(Collectors.toList());
        //System.out.println(check);

        List<Integer> scoreList = Arrays.asList(50,60,90,40,99);
        List<Integer> filterList = scoreList.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted((a,b)->(b-a))
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());



        System.out.println(filterList);

        List<Integer> colle1 = Stream.iterate(0, x -> x + 1)
                .limit(100)
                .skip(1)
                .filter(x -> x%2 ==0)
                .collect(Collectors.toList());
        System.out.println(colle1);


    }
}
