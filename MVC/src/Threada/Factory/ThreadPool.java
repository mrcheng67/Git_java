package Threada.Factory;

import java.util.concurrent.*;

public class ThreadPool extends Thread {
    public static void main(String[] args) throws ClassNotFoundException, ExecutionException, InterruptedException {
        Thread t = new Thread();
        Take take1 = new Take();
        Take take2 = new Take();
        Take take3 = new Take();
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5,10,10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(),new CustomFactory(),new ThreadPoolExecutor.AbortPolicy());
        threadPool.execute(take1);
        threadPool.execute(take2);
        threadPool.execute(take3);
        threadPool.execute(t);
        // ------------------------ CallableThreadTest
        Call<String> call = new Call<>(55);
        Future<String> fu = threadPool.submit(call);
        System.out.println(fu.get());
        threadPool.shutdown();
    }

}

class Call<String> implements Callable<String> {
    private int n;
    public Call(int n){
        this.n = n;
    }
    @Override
    public String call() {
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            sum = sum+i;
        }
        return (String) (Thread.currentThread().getName()+"线程返回值 输入数"+n+"的和相加为："+sum);
    }
}