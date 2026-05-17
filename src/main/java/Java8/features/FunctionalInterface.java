package Java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<String,Integer> func = x -> x.length();
        //System.out.println(func.apply("Pavam"));
        Function<String,String> func2 = s -> s.substring(0,3);
        //System.out.println(func2.apply("abcdefghijk"));
        Function<List<Student>,List<Student>> studentVip = li ->{

            List<Student> result = new ArrayList<>();

            for(Student st : li){
                if(func2.apply(st.getName()).equalsIgnoreCase("vip"))

                    result.add(st);
            }
            return result;

        };
        Student s1 = new Student(1,"vipul");
        Student s2 = new Student(2,"vipulav");
        Student s3 = new Student(2,"abcd");

        List<Student> students = Arrays.asList(s1,s2,s3);
        List<Student> filterStudent = studentVip.apply(students);
        System.out.println(filterStudent);

    }
    private static class Student{

        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
