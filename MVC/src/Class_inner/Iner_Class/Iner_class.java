package Class_inner.Iner_Class;

public class Iner_class { // 外部类
    public int a = 10;
    public String str;
    private String arr;

    public static void main(String[] args){
        test t = new test();
        System.out.println("--- 内部类 ---");
        test.Iner_cla ti= t.new Iner_cla(); // 先使用实例化后的外部类 再根据外部类生命内部类
        ti.test();

        System.out.println("--- 静态内部类 ---");
        test.InnerClass2 tsi = new test.InnerClass2(); //静态内部类可以直接这么实例化
        tsi.test();
        System.out.println("--- 局部内部类 ---");
        t.method();
    }

    @Override
    public String toString() {
        return "Iner_class{" +
                "a=" + a +
                ", str='" + str + '\'' +
                '}';
    }
}

/*
内部类中
非静态数据
System.out.println(data1);//优先打印出内部类中的data1变量
System.out.println(this.data1);//打印出内部类中的data1变量
System.out.println("外部类的非静态的data1："+OuterClass.this.data1);//打印出外部类中的data1变量

静态数据
System.out.println("外部类的静态的data3："+OuterClass.data3);//打印出外部类中的data3变量
*/

class test{
    public int i = 10;
    static int a = 20;
    static final int  b = 30;
    class Iner_cla{ //内部类
        int i = 12;
        static int a = 22;
        static final int  b = 32;
        public void test(){
            System.out.println("内部类 --- 当前数字: i = " + i + "\ta = " + a + " \tb = " + b);
            System.out.println("内部类 --- this数字: this.i = " + this.i + "\tthis.a = " + this.a + " \tthis.b = " + this.b);
            System.out.println("内部类 --- 外部数字: test.this.i = " + test.this.i + "\ttest.this.a = " + test.this.a + " \ttest.this.b = " + test.this.b);
        }
    }
    // 成员位置定义：被static修饰 ---> 静态内部类
    static class InnerClass2{
        public int i = 14;
        static int a = 24;
        static final int  b = 34;
        public void test(){
            System.out.println("静态内部类 --- 当前数字: i = "+ i +"\t  a = " + a + "\t b = " + b); //静态内部类中不可以调用非静态的外部量
            System.out.println("静态内部类 --- this数字: this.i = "+this.i+"\t  this.a = " + this.a + "\t this.b = " + this.b);
            System.out.println("静态内部类 --- 外部数字: test.i = 不可调用  test.a = " + test.a + "\t test.b = " + test.b);
        }
    }
    public void method(){
        // 方法中也可以定义内部类 ---> 局部内部类：几乎不用
        class InnerClass5{
            int i = 16;
            static int a = 26;
            static final int  b = 36;
            public void test(){
                System.out.println("局部内部类 --- 当前数字: i = "+ i +"\t  a = " + a + "\t b = " + b); //静态内部类中不可以调用非静态的外部量
                System.out.println("局部内部类 --- this数字: this.i = "+this.i+"\t  this.a = " + this.a + "\t this.b = " + this.b);
                System.out.println("局部内部类 --- 外部数字: test.this.i = 非静态不可调用  test.a = " + test.a + "\t test.b = " + test.b);
            }
        }

        InnerClass5 innerClass = new InnerClass5();// 只能在该方法体内部使用，其他位置都不能用
        innerClass.test(); //再test中调用 method 方法才能使用
    }
}