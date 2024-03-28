package Class_inner.practice;


public class ClassLoad {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(B.num);      // 直接使用类的静态属性，也会导致类的加载

    }
}

class B {
    static { // 静态代码块
        System.out.println("B 静态代码块被执行");
        num = 300;
        c c = new c();  // 静态代码块在调用的时候执行
    }
    static int num = 100;// 静态变量

    public void Bill() {// 构造器
        System.out.println("B() 构造器被执行");
        new c(){
            @Override
            public void eat(){
                System.out.println("吃粑粑" + num); //内部类不行
            }
        };
    }

}


