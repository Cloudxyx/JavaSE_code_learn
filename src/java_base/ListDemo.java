package java_base;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list.get(0));

        //set  hashset无序
        Set<String> se = new HashSet<>();
        se.add("hello");
        se.add("java");
        for (String s:se){
            System.out.println(s);
        }

        //treeset  会排序不重复
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(1);
        ts.add(5);
        for (int x:ts){
            System.out.println(x);
        }
        ArrayList<Object> a = new ArrayList<>();
        a.add("D");
        a.add(String.valueOf(5));
        System.out.println(a);


    }
}
