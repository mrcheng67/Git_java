package Serializ;

import java.io.*;

public class Serializ implements Serializable {
    public static void main(String[] args){
        User use = new User();
        use.setName("程昊");
        use.setAge(18);
        use.setId(202234261083.0);
        try{
            FileOutputStream steam = new FileOutputStream("./src/Serializ/tmp/use.ser");
            ObjectOutputStream out = new ObjectOutputStream(steam);
            out.writeObject(use);
            out.close();
            steam.close();
            System.out.println("牛逼，跑完了");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }

}

