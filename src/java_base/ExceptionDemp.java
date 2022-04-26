package java_base;

public class ExceptionDemp {
    public static void main(String[] args) {
        System.out.println("start");
        method();
        System.out.println("end");
    }
    public static void method(){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("index error");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

    }
}
