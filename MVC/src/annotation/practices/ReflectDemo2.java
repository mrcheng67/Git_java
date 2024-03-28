package annotation.practices;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

// 用注解来加载Properties文件   做一个Reflect框架 利用反射 想执行哪个方法就哪个方法
@Pro(ClassName = "annotation.practices.Animal.Dog",MethodName = "eat")
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        // 1.解析注解
        // 1.1 获取该类的字节码文件对象
        Class<ReflectDemo2> reflectDemo2 = ReflectDemo2.class;
        // 2.获取上面的注解对象
        Pro an = reflectDemo2.getAnnotation(Pro.class);
        // 其实就是在内存中生成了一个该注解接口的子类实现对象
        // 3. 调用注解中定义的抽象方法 获取返回值
        String className = an.ClassName();
        String MethodName = an.MethodName();

        Class cla = Class.forName(className);
        Object obj = cla.newInstance();
        Method method = cla.getMethod(MethodName);
        method.invoke(obj);
    }
}
