package Threada.synchron;

public class MyRunable extends Thread{
    int ticket=0;
    @Override
    public void run(){
        while(true){
            if (extracted()) break;
        }
    }

    private synchronized boolean extracted() {
        if (ticket >= 100){
            return true;
        }
        else{
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"已经卖出票"+ticket+"张");  // 线程不加getname就是同一个
        }
        return false;
    }
}
