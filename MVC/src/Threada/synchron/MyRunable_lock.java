package Threada.synchron;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunable_lock extends Thread{
    int ticket=0;
    static Lock lock = new ReentrantLock();
    @Override
    public void run(){
        while(true){
            lock.lock();
            try {
            if (ticket >= 100){
                break;
            }
            else{
                //Thread.sleep(2);
                ticket++;
                System.out.println(Thread.currentThread().getName()+"已经卖出票"+ticket+"张");  // 线程不加getname就是同一个
            }
            }catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        }
    }
}
