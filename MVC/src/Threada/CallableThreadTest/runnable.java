package Threada.CallableThreadTest;

public class runnable implements Runnable{

    @Override
    public void run() {
        for(int i =0;i<50;i++){
            System.out.println("run方法成功"+i+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args){
        Thread thread = new Thread(new runnable(),"--- 线程1 ---");
        thread.start();

        // 也支持 lambda 表达式
        Thread thread1 = new Thread(() -> {
            System.out.println("my runnable"+Thread.currentThread().getName());
        },"--- 线程2 ---");

        thread1.start();
    }
}
