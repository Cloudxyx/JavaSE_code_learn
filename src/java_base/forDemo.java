package java_base;

import java.util.Stack;

public class forDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,9};
        for (int i : arr){
            System.out.println(i);
        }
        String[] strarr = {"5","dd"};
        for (String s:strarr){
            System.out.println(s);
        }

        //栈
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(60);
        System.out.println(st);

    }
}
