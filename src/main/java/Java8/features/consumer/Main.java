package Java8.features.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> con = s -> System.out.println(s);
        //con.accept("raj");

        Consumer<List<Integer>> listCon = li -> {
            for(Integer i : li){
                System.out.println(i+100);
            }
        };
        //listCon.accept(Arrays.asList(1,22,3,4,5));
        Consumer<List<Integer>>  listCon2 = li ->{
            for (Integer j : li){
                System.out.println(j);
            }
        };
        Consumer<List<Integer>> lis = listCon2.andThen(listCon);
        lis.accept(Arrays.asList(1,2,3,4));

    }

}
