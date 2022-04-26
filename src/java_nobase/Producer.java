package java_nobase;

public class Producer implements Runnable{
    private Box b;
    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int x=1;x<=5;x++){
            b.put(x);
        }
    }
}
