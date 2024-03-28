package Threada.Factory;

public class Take implements Runnable{

    @Override
    public void run() {
        System.out.println("这条线程名为 : "+Thread.currentThread().getName());
    }
}
