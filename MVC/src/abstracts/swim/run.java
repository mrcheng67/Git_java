package abstracts.swim;

public interface run {
    
    int a = 0;
    public void run();

    //Java 8.0之后可以定义静态方法 与 default方法
    default void defaultMethod(){
        System.out.println("default 方法");
    }
    static void staticMethod(){
        System.out.println("静态方法");
    }
}
