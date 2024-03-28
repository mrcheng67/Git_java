package Socket.TCP;

import java.io.*;
import java.net.Socket;
import java.util.Iterator;


//保证多个用户可以同时发给服务器
public class ThreadServe extends Thread{
    private Socket socket;

    public ThreadServe(Socket socket){
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
                    System.out.println("用户"+socket.getRemoteSocketAddress()+"发消息:\n"+str+"\n");
                    SendToAll(str);
                }catch (Exception i){
                    System.out.println("用户"+socket.getRemoteSocketAddress()+"已下线");
                    Server.UserList.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void SendToAll(String str) throws Exception{
        for(Socket socket:Server.UserList){
            OutputStream os = socket.getOutputStream();
            DataOutputStream dis = new DataOutputStream(os);
            dis.writeUTF(str);
            dis.flush();
        }
        /*Iterator<Socket> it = Server.UserList.iterator();
        while(it.hasNext()){
            OutputStream os = it.next().getOutputStream();
            DataOutputStream dis = new DataOutputStream(os);
            dis.writeUTF(str);
            dis.flush();
        }*/
    }
}
