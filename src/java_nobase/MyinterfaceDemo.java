package java_nobase;

public class MyinterfaceDemo {
    public static void main(String[] args) {
        MyInterfaceC my = new MyInterfaceC();
        my.show1();
        my.show2();
        my.show3();
        //接口的静态方法只能被接口调用
        MyInretface.show4();

    }
}
