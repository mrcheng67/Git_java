package Threada.Factory;

import java.awt.dnd.Autoscroll;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomFactory implements ThreadFactory {
    private  final AtomicInteger i = new AtomicInteger(1);

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("这是第"+i.getAndIncrement()+"个线程");
        return thread;
    }
}
