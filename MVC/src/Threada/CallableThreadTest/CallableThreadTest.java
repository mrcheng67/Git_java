package Threada.CallableThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadTest{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Call<String> ctt = new Call(25);
        FutureTask<String> ft = new FutureTask<>(ctt);
        new Thread(ft,"有返回值的线程").start();
        System.out.println("子线程的返回值："+ft.get());  // ft.get得到返回值
    }
}


class Call<String> implements Callable<String> {
    private int n;
    public Call(int n){
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            sum = sum+i;
        }
        return (String) ("线程返回值 输入数"+n+"的和相加为："+sum);
    }
}