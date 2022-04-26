package java_nobase;

public interface MyInretface {
    //抽象方法
    public abstract void show1();
    void show2();
    //默认方法


    public default void show3(){
        System.out.println("show3");
        show5();
    }
    //静态方法
    public static void show4(){
        System.out.println("show4");
        show6();
    }
    //私有方法
    private void show5(){
        System.out.println("show5");
    }
    private static void show6(){
        System.out.println("show6");
    }
}
