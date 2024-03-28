package Socket.TCP;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> UserList = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        ServerSocket s_socket = new ServerSocket(8888);
        while(true){
            Socket socket = s_socket.accept();
            UserList.add(socket);
            System.out.println("-----------------------------------------\n");
            System.out.println("用户"+socket.getRemoteSocketAddress()+"以上线");
            new ThreadServe(socket).start();
        }

    }
}
