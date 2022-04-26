package java_nobase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("周伦发");
        manList.add("成立");
        manList.add("刘德华");
        manList.add("五金");
        manList.add("李连杰");
        manList.add("周星驰");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳就");
        womanList.add("林志玲");
        womanList.add("王祖贤");

        Stream<String> manlimit = manList.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> womanlimit = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
        Stream<String> concat = Stream.concat(manlimit, womanlimit);

//        concat.map(s -> new Actor(s)).forEach(p -> System.out.println(p.getName()));
        List<String> names = concat.collect(Collectors.toList()); //收集到列表
        System.out.println(names);

    }
}
