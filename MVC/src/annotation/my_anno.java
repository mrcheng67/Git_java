package annotation;

/*
*  元注解      1. @Target
*             2. @Retention
*             3. @Documented
*             4. @Inherited
* */
public @interface my_anno {
    // 以下的 数组类 也行
    // 需要给他们赋值  有default 可以不用赋值
    // 只有一个要赋值 并且 那个值为value 可以直接写值
    String data() default "程昊";// String类
    int value(); // int 类
    my_anno2 data3() default @my_anno2; //注解类
    person data4() default person.p1; //枚举类
    String[] data5() default {"程昊","王维","杜甫"};
    String[] data6() default "程昊";// 数组中只有一个值 大括号可以省略


}
