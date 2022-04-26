package java_base;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String s = "56 25 62 3 12 6";
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
