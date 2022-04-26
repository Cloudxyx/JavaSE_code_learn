package java_nobase;

public class Box {
    private int milk;
    private boolean state = false;
    public synchronized void put(int milk){
        if (state){//如果有牛奶就wait
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果没有牛奶，生产
        this.milk = milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶箱");
        //生产完毕之后修改奶箱状态
        state = true;
        //唤醒其他线程
        notifyAll();
    }
    public synchronized void get(){
        if (!state){ //没有牛奶，等待生产
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("用户拿到第"+this.milk+"瓶奶");

        state = false;

        notifyAll();
    }

}
