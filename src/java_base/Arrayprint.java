package java_base;

public class Arrayprint {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printarray(arr);
    }

    public static void printarray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.print("]");
    }
}

