package java_base;

import java.util.Scanner;

public class Oushu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int x = 0; x <= n; x++) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
