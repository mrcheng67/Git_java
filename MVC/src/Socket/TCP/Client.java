package Socket.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",8888);
        new ClientThread(socket).start();
        OutputStream so = socket.getOutputStream();
        DataOutputStream Ds = new DataOutputStream(so);
        Scanner sc = new Scanner(System.in);
        while(true){
            String bf = sc.next();
            Ds.writeUTF(bf);
            if(bf.equals("exit")){
                break;
            }
        }
        Ds.close();
        socket.close();
    }
}
