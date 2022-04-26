package java_nobase;

public class Sell implements Runnable{
    private int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while(true) {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets + "��Ʊ");
                    tickets--;
                }
            }
        }
    }
}
