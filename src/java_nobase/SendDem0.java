package java_nobase;

import java.io.IOException;
import java.net.*;
//udp发送数据
public class SendDem0 {
    public static void main(String[] args) throws IOException {
        //创建发送端对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据并打包
        byte[] bys = "hello,udp,后".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("169.254.198.178");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("169.254.198.178"),10086);
        //发送数据
        ds.send(dp);
        //关闭
        ds.close();
    }
}
