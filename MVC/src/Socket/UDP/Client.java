package Socket.UDP;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

// 客户端 读取文件 发送给 服务端
public class Client {
    String ppp = null;
    public static void main(String[] args) throws Exception {
        File f = new File("C:/Users/DELL/OneDrive/桌面/GAN模型.txt");
        FileInputStream ff = new FileInputStream(f);
        InputStreamReader text = new InputStreamReader(ff,"UTF-8");
        StringBuffer huber = new StringBuffer();
        while (text.ready()) {
            huber.append((char) text.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(huber.toString());
        text.close();

        byte[] bytes = huber.toString().getBytes("UTF-8");
        System.out.println("--------------------客户端启动----------------------");
        DatagramSocket s = new DatagramSocket();

        DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),6666);
        s.send(packet);
        s.close();
    }
}
