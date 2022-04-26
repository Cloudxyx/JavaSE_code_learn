package java_base;

public class fanzhuan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("反转前：");
        printarray(arr);
        System.out.println();
        int n = arr.length;
        for (int i = 0; i <= n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("反转后：");
        printarray(arr);
    }

    public static void printarray(int[] arr) {
        int n = arr.length;
        for (int x = 0; x < n; x++) {
            System.out.print(arr[x] + ",");
        }
    }
}
