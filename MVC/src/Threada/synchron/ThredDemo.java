package Threada.synchron;

public class ThredDemo {
    public static void main(){
/*
        MyRunable m1 = new MyRunable();
        MyRunable m2 = new MyRunable();
        MyRunable m3 = new MyRunable();
        m1.setName("窗口1");
        m2.setName("窗口2");
        m3.setName("窗口3");
        m3.start();
        m2.start();
        m1.start();

        MyRunable R1 = new MyRunable();
        Thread t1 = new Thread(R1);
        Thread t2 = new Thread(R1);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
*/
        MyRunable_lock R1 = new MyRunable_lock();
        Thread t1 = new Thread(R1);
        Thread t2 = new Thread(R1);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t1.start();
        t2.start();
        System.out.println("----------------------------");

    }


}
