package java_base;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tongjizifu {
    public static void main(String[] args) {
        String s = "aabbccbdddgff";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Map.Entry<Character, Integer>> e = map.entrySet();
        for (Map.Entry<Character, Integer> x:e){
            Character key = x.getKey();
            Integer value = x.getValue();
            System.out.print(key+"("+value+")");
        }
        System.out.println();
        System.out.println(map);
    }
}
