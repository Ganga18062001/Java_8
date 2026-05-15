package Java8.features;

import java.util.*;

//class Check implements Comparator<Integer>{
//    @Override
//    public int compare(Integer a, Integer b) {
//        return b-a;
//    }
//}
public class ComparatorInLambadaExpre {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(100);
        li.add(200);
        li.add(101);
        li.add(102);

       // Collections.sort(li,new Check());//instedb of this
        Collections.sort(li,(a,b)->a-b);//we does not need to use compare method

        System.out.println(li);
//---------------------------------------------------------------
        Set<Integer> s = new TreeSet<>((c,d)->d-c);
        s.add(1);
        s.add(5);
        s.add(6);
        s.add(6);
        s.add(0);
        //s.add(null);
       // s.add(null);

        System.out.println(s);

//------------------------map---------------------------------------
Map<Integer,String> m = new TreeMap<>();

m.put(100,"aaa");
m.put(111,"bbb");
m.put(222,"ccc");

        System.out.println(m+"Before sorting");

        Map<Integer,String> mp = new TreeMap<>((a,b)->b-a);

        mp.put(100,"aaa");
        mp.put(111,"bbb");
        mp.put(222,"ccc");

        System.out.println(mp+"After sorting");


    }
}
