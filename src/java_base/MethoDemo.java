package java_base;

public class MethoDemo {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int res = getmax(x,y);
        System.out.println("最大值是" + res);
    }
    public static int getmax(int x,int y){
        if (x>=y){
            return x;
        }else {
           return y;
        }
    }
}
