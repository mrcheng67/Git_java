package reflect;

import reflect.Animal.animal;
import Class_inner.Iner_Class.Iner_class;

import reflect.Animal.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        // 获取字节码Class对象的三种方式
        // 1. Class.forName         多用于配置文件 读取文件 加载类
        Class cls1 = Class.forName("Class_inner.Iner_Class.Iner_class");
        System.out.println("Class.forName(Class_inner.Iner_Class.Iner_class) = "+ cls1);
        // 2.  多用于参数传递
        Class cls2 = Iner_class.class;
        System.out.println("Iner_class.class = "+cls2);
        // 3. 多用于对象的获取字节码文件的方式
        Iner_class ic = new Iner_class();
        Class cls3 = ic.getClass();
        System.out.println("ic.getClass() = "+ic.getClass());

         // Class 对象 可以获取1.成员变量们 2.构造方法们 3.成员方法们 4. 类名
        System.out.println("======================================== 获取值 =================================================================================");
        Field[] field1 = cls1.getFields();  // 只能获取 public 修饰的
        for(Field a : field1){
            System.out.println("数字为 = "+a);
        }
        System.out.println("============================================");
        Field field2 = cls1.getField("a");
        Iner_class t = new Iner_class();
        Object value = field2.get(t);
        System.out.println(value);
        field2.set(t,1);
        System.out.println(t);

        System.out.println("============================================");
        Field[] fields = cls1.getDeclaredFields();  // getDeclaredFields 可以获取所有  不止是public
        for(Field f: fields){
            System.out.println("getDeclaredFields 获取"+f);
        }

        System.out.println("============================================");
        Field f = cls1.getDeclaredField("arr");
        f.setAccessible(true); //暴力反射  需要设置这个才能保证 可以指定访问到private 修饰的值
        Object obj = f.get(t);
        System.out.println("getDeclaredField不能单独去访问private值 = "+obj);

        System.out.println("======================================== 获取构造器 =================================================================================");
        Object o = cls3.newInstance();   // 实例化
        Constructor con = cls3.getConstructor();
        System.out.println(o);

        System.out.println("======================================== 获取Method =================================================================================");
        Class cls4 = Class.forName("reflect.Animal.Dog");
        Method eat_method = cls4.getMethod("eat");
        animal ani = new Dog();   // 实例化 构造器与method 都需要实例化
        eat_method.invoke(ani);   // 执行方法

        Method[] eat_method2 = cls4.getMethods();
        for(Method method:eat_method2){
            System.out.println("method 方法 = " + method);
            String name = method.getName();
            System.out.println("Name = " + name);
        }

    }
}
