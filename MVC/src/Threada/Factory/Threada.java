package Threada.Factory;


import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Threada extends Thread {
    public static void main(String[] args){
        Thread t = new Thread();
        Take take1 = new Take();
        Take take2 = new Take();
        Take take3 = new Take();
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5,10,10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(),new CustomFactory(),new ThreadPoolExecutor.AbortPolicy());
        threadPool.execute(take1);
        threadPool.execute(take2);
        threadPool.execute(take3);
        threadPool.execute(t);
        threadPool.shutdown();
    }
}
