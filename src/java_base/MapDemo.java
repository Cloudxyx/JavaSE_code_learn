package java_base;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","xxx");
        map.put("2","ddd");
        System.out.println(map);
        System.out.println(map.values());
    }
}
