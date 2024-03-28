package Serializ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnSerializ {
    public static void main(){
        User use = null;
        try{
            FileInputStream ase = new FileInputStream("./src/Serializ/tmp/use.ser");
            ObjectInputStream in = new ObjectInputStream(ase);
            use = (User) in.readObject();
            in.close();
            ase.close();

        }catch(
        IOException e)
        {
            e.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("use.name = "+use.getName());
        System.out.println("use.age = "+use.getAge());
        System.out.println("use.Id = "+use.getId());
    }
}
