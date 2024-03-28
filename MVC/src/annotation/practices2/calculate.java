package annotation.practices2;

public class calculate {
    @check(a=1,b = 0)
    public void add(int a, int b){
        System.out.println("a + b = " + (a + b));
        //return a+b;
    }
    @check(a=1,b = 0)
    public void sub(int a, int b){
        System.out.println("a - b = " + (a - b));
        //return a-b;
    }
    @check(a=1,b = 0)
    public void mul(int a, int b){
        System.out.println("a * b = " + (a * b));
        //return a*b;
    }
    @check(a=1,b = 0)
    public void exp(int a, int b){
        System.out.println("a / b = " + (a / b));
        //return a/b;
    }
    public void process(int a, int b){
        System.out.println("程序运行成功");
    }
}
