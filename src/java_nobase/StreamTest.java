package java_nobase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("���׷�");
        manList.add("����");
        manList.add("���»�");
        manList.add("���");
        manList.add("������");
        manList.add("���ǳ�");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("������");
        womanList.add("������");
        womanList.add("����ϼ");
        womanList.add("����");
        womanList.add("��־��");
        womanList.add("������");

        Stream<String> manlimit = manList.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> womanlimit = womanList.stream().filter(s -> s.startsWith("��")).skip(1);
        Stream<String> concat = Stream.concat(manlimit, womanlimit);

//        concat.map(s -> new Actor(s)).forEach(p -> System.out.println(p.getName()));
        List<String> names = concat.collect(Collectors.toList()); //�ռ����б�
        System.out.println(names);

    }
}
