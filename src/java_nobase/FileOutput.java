package java_nobase;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream(".\\test.txt",true);
//        fos.write("hello".getBytes());
//        fos.close();
        FileOutputStream fos = new FileOutputStream(".\\testcopy.txt",true); //复制文件
        FileInputStream fis = new FileInputStream(".\\test.txt");
        //缓冲流 最快
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(".\\testcopy.txt",true));
        byte[] bys = new byte[1024];
        int len;
        while((len = fis.read(bys))!= -1){
            System.out.println((new String(bys,0,len)));
//            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }
}
