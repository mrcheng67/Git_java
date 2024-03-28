package In_Out;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        do{
            str = br.readLine();
            System.out.println("str = "+str);
        }while(!str.equals("exit"));

    }
}
