package java_base;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = {15, 56, 87, 952, 123};
        int max = arr2[0];
        for (int x = 1; x < arr2.length; x++) {
            if (arr2[x] > max) {
                max = arr2[x];
            }
        }
        System.out.println(arr);
        System.out.println(max);

    }
}
