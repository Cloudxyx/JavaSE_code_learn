package java_nobase;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        ds.receive(dp);

        //解析数据包
        byte[] datas = dp.getData();
        int length = dp.getLength();
        String dataString = new String(datas,0,length);
        System.out.println(dataString);

        ds.close();
    }
}
