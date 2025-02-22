package annotation.practices;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})     // 只能用于类
@Retention(RetentionPolicy.RUNTIME)  //可以加载到JVM中
public @interface Pro {
    String ClassName();
    String MethodName();

}
