package java_base;

import java.util.Scanner;

public class StringPrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("�����ַ���");
        String line = s.nextLine();
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
