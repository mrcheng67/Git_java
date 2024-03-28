package Class_inner.Iner_Block;

import java.util.Comparator;

public class learn { // 匿名内部类
    static int a =10;
    public static void main(String[] args){
        int c =0;
        Animal a = new Animal();
        method(a);
        System.out.println("------------------------");
        Animal d = new Dog();
        method(d);
        System.out.println("------------------------");

        method(
            new Dog(){
                @Override
                public void animal(){
                    System.out.println("我是动物");
                }
            });
        method2(new swim() {
            @Override
            public void eat(String s) {
                System.out.println("我是游泳");
            }
        });

        //lambda 表达式
        System.out.println("------------------------");
        method2(
                (s) -> {
                    System.out.println("我是游泳");
                }
        );
        // 省略写法
        method2(s-> System.out.println("我是游泳"+s + a));

        Comparator av = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
    }

    public static void method(Animal animal){
        animal.animal();
    }

    public static void method2(swim s){
        String sb = "1";
        s.eat(sb);
        // 匿名内部类
        // 实现关系 接口 implement 匿名内部类
        new swim(){
            @Override
            public void eat(String sb){
                System.out.println("吃屎" + a);
            }
        };
        // extend
        new Animal(){
            @Override
            public void animal(){
                System.out.println("动物吃屎");
            }
        };
    }

}
