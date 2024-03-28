package Socket.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------服务器启动----------------------");
        DatagramSocket s = new DatagramSocket(6666);
        byte[] buffer = new byte[2014*64];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        s.receive(packet);
        int len = packet.getLength();
        String rece = new String(buffer,0,len);
        System.out.println("收到消息来自:"+packet.getAddress()+"\n端口:"+packet.getPort()+"\n收到消息:"+rece);
        // System.out.println("收到消息来自:%d\n"+packet.getAddress()+"端口:%d\n"+packet.getPort()+"收到消息:%d"+rece);
        s.close();
    }
}
