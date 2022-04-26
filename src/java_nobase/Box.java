package java_nobase;

public class Box {
    private int milk;
    private boolean state = false;
    public synchronized void put(int milk){
        if (state){//�����ţ�̾�wait
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //���û��ţ�̣�����
        this.milk = milk;
        System.out.println("���̹�����"+this.milk+"ƿ�̷�������");
        //�������֮���޸�����״̬
        state = true;
        //���������߳�
        notifyAll();
    }
    public synchronized void get(){
        if (!state){ //û��ţ�̣��ȴ�����
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("�û��õ���"+this.milk+"ƿ��");

        state = false;

        notifyAll();
    }

}
