package abstracts.swim;

public class student extends swim implements run{

    @Override
    public void swim() {
        System.out.println("我是学生，我要游泳");
    }

    @Override//这是实现的方法
    public void run() {
        System.out.println("我是学生，我要跑步");
    }

    @Override // 复写default方法  可以写 也可以删除
    public void defaultMethod() {
        run.super.defaultMethod();
    }
}

