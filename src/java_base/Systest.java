package java_base;

public class Systest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int x = 0; x < 1000; x++) {
            System.out.println(x);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
