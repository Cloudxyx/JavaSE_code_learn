package java_nobase;

public class SellDemo {
    public static void main(String[] args) {
        Sell2 s = new Sell2();
        Thread t1 = new Thread(s,"����1");
        Thread t2 = new Thread(s,"����2");
        Thread t3 = new Thread(s,"����3");

        t1.start();
        t2.start();
        t3.start();
    }
}
