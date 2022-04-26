package java_base;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {15, 12, 56, 3, 35, 1};
    /*
        System.out.println("≈≈–Ú«∞£∫"+printArray(arr));
        System.out.println("≈≈–Ú∫Û£∫"+printArray(maopaosort(arr)));

    }

    public static String printArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x=0;x< arr.length;x++){
            if (x==arr.length-1){
                sb.append(arr[x]);
            }else {
                sb.append(arr[x]);
                sb.append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }

    public static int[] maopaosort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int x=0;x< arr.length-1-i;x++){
                if (arr[x]>arr[x+1]){
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;
                }
            }
        }
        return arr;
    }

     */
        //Arrays∞¸
        System.out.println("qian" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("hou" + Arrays.toString(arr));

        //String ---- int
        String a = "120";
        System.out.println(Integer.parseInt(a));

        //int --- String
        int b = 100;
        System.out.println(String.valueOf(b));
    }

}
