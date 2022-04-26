package java_nobase;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("CloudFly-PC");
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(hostName+","+hostAddress);

    }
}
