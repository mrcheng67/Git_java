package annotation.practices2;

import annotation.practices.ReflectDemo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class calculateTest {
    static int error = 0;
    public static void main(String[] args) throws Exception {
        calculate cal = new calculate();
        Class clas = cal.getClass();
        Method[] methods = clas.getMethods();
        BufferedWriter buff = new BufferedWriter(new FileWriter("bug.txt"));

        // 不一定需要这个 Class<calculate> calcu = calculate.class;       //不知道通上方 Class clas = cal.getClass(); 是否一样 可以测试一下
        for(Method method : methods){
            try{
                check ck = method.getAnnotation(check.class);
                int a = ck.a();
                int b = ck.b();
                method.invoke(cal,a,b);
            }catch(Exception e)
            {
                error++;
                buff.write(method.getName()+"方法异常");
                buff.newLine();
                if (e.getCause() != null) {
                    buff.write("报错名" + e.getCause().getClass().getSimpleName());
                    buff.newLine();
                    buff.write("报错原因" + e.getCause().getMessage());
                    buff.newLine();
                } else {
                    System.out.println("No cause exception.");
                }
                buff.write("----------------------------------");
                buff.newLine();
            };
        }
        buff.write("总异常数为"+error);
        buff.flush();
        buff.close();

    }
}
