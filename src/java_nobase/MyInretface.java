package java_nobase;

public interface MyInretface {
    //���󷽷�
    public abstract void show1();
    void show2();
    //Ĭ�Ϸ���


    public default void show3(){
        System.out.println("show3");
        show5();
    }
    //��̬����
    public static void show4(){
        System.out.println("show4");
        show6();
    }
    //˽�з���
    private void show5(){
        System.out.println("show5");
    }
    private static void show6(){
        System.out.println("show6");
    }
}
