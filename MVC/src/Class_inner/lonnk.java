package Class_inner;

public class lonnk {
    public String name;
    public double score;
    public int age;
    public static String classes = "520class";

    // 一个方法，用于打印学生信息
    public void printInfo() {
        System.out.println("Name: " + name + ", Score: " + score + ", Age: " + age + ", Class: " + classes);
    }

    // 静态代码块
    static{
        classes = "520";
        System.out.println("静态代码块"+classes);
    }

    //实例化代码块
    {
        name = "wujianyong ";
        System.out.println("--- lonnk 中的实例化代码块");

    }

    public static void main(String[] args) {
        lonnk student1 = new lonnk();
        student1.printInfo(); // 打印学生1的信息

        System.out.println("==============================");

        lonk stu = new lonk("wujian", 29.0, 28);

        { //直接使用{}定义，普通方法块
            int x = 15;
            System.out.println("x1 = " +x);
        }
    }
}

class lonk{
    public String name;

    //实例化代码块
    {
        name = "wujianyong ";
        System.out.println("--- lonk 中的实例化代码块");

    }
    public lonk(String meng, double v, int i) {
        System.out.println("名字:"+ meng +"分数"+ v +"年龄"+ i);
    }
}