package java_base;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //Ìí¼ÓÔªËØ
        array.add("hello");
        array.add("world");
        array.add(0,"i");
        array.add("hello");
        System.out.println(array);
        printArrayl(array);
    }

    public static void printArrayl(ArrayList<String> array){
        for (int x=0;x<array.size();x++){
            String ch = array.get(x);
            System.out.println(ch);
        }
    }
}
