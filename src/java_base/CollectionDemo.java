package java_base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("world");
        //±éÀúlistÔªËØ
        Iterator<String> it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
