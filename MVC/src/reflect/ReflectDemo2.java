package reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

// 做一个Reflect框架 利用反射 想执行哪个方法就哪个方法
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        // 1. 创建properties对象
        Properties pro = new Properties();
        // 2.加载配置文件properties
        ClassLoader classLoader = ReflectDemo2.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 3. 获取配置文件中的数据进内存
        String ClassName = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 4.加载该类进内存
        Class cls = Class.forName(ClassName);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
