package annotation;


import java.lang.annotation.*;

/*
*       元注解: 用于描述注解的注解
*           @Target:
*               ElementType
*                   TYPE:可以作用于类上
*                   METHOD:可以作用于方法上
*                   FIELD:可以作用于成员变量
*           @Retention:
*               @Retention(RetentionPolicy.RUNTIME):当前被描述的注解，会保留到class文件中被JVM读取
*           @Documented:
*           @Inherited:
*
*
* */

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD}) //作用于类上    //作用于方法上    //作用于成员变量
@Retention(RetentionPolicy.RUNTIME) //可以被JVM读取  //class 不可以被读取
@Documented  //可以生成文档
@Inherited      //可以被继承
public @interface source {
}
