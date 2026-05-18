package Java8.features.methodAndConstruReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public   void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
//-------------method references------------------
        Main main = new Main();


        List<String> student = Arrays.asList("aaa","bbb","ccc");
       // student.forEach(x -> Main.print(x));  //method is static
        student.forEach(main :: print);

        //-----------constrructor reference----------------

        List<String> names = Arrays.asList("raj","ram","rani");
        List<Student> collect = names.stream().map(Student ::new).collect(Collectors.toList());


    }
}
