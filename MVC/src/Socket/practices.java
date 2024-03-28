package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;

public class practices {
    public static void main(String[] args) throws Exception {
        InetAddress ip1 = InetAddress.getLocalHost();   // 得到本机名 与 ip
        System.out.println("ip1.getLocalHost()"+ip1.getLocalHost());
        System.out.println("ip1.getHostName()"+ip1.getHostName());
        System.out.println("ip1.getHostAddress()"+ip1.getHostAddress());

        InetAddress ip2 = InetAddress.getByName("www.baidu.com");   //得到指定名的ip
        System.out.println("ip2.getHostName()"+ip2.getHostName());
        System.out.println("ip2.getHostAddress()"+ip2.getHostAddress());
    }
}
