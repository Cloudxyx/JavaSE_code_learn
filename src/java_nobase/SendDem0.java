package java_nobase;

import java.io.IOException;
import java.net.*;
//udp��������
public class SendDem0 {
    public static void main(String[] args) throws IOException {
        //�������Ͷ˶���
        DatagramSocket ds = new DatagramSocket();
        //�������ݲ����
        byte[] bys = "hello,udp,��".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("169.254.198.178");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("169.254.198.178"),10086);
        //��������
        ds.send(dp);
        //�ر�
        ds.close();
    }
}
