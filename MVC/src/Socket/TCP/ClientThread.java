package Socket.TCP;

import java.io.*;
import java.net.Socket;


// 捕获其他用户发的消息
public class ClientThread extends Thread{
    private Socket socket;
    public ClientThread(Socket socket){
           this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while(true) {
                try{
                    String str = dis.readUTF();
                    System.out.println("用户"+socket.getRemoteSocketAddress()+"发消息:\n"+str);
                }catch (Exception i){
                    System.out.println("用户"+socket.getRemoteSocketAddress()+"已下线");
                    dis.close();
                    socket.close();
                    break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
