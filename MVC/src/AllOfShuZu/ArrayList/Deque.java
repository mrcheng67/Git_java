package AllOfShuZu.ArrayList;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Deque {
    /*
            ArrayDeque 是 Java 集合中双端队列的数组实现，双端队列的链表实现（LinkedList）。
            ArrayDeque 几乎没有容量限制，设计为线程不安全的，禁止 null 元素。
            ArrayDeque 作为栈使用时比 Stack 类效率要高，作为队列使用时比 LinkedList 要快。
            原文链接：https://blog.csdn.net/mingyuli/article/details/115830113
    * */
    //   同一个ArrayQeque中集有队列又有堆的情况     堆输出的按照堆的方式输出 队列的按照队列方式 总体按照队列方式 先进先出
    public static void main(String[] args){
        ArrayDeque AD = new ArrayDeque();
        System.out.println("AD.peek()获取第一个值 如果没有返回null"+AD.peek());
        AD.add(10086);
        AD.add(10010);
        AD.push(2);         //add与push都可以使用 一个作为队列 一个作为 栈
        AD.push(100);       //add 是往后面加数据 push是往前面加数据
        AD.push(22);
        AD.add(189);
        //AD.pop();              // 移除栈顶元素   最后进去的那一位  ,如果栈顶没有元素将抛出异常
        System.out.println(AD);
        System.out.println("AD.offer(1)添加元素后判断是否成功:"+AD.offer(1));
        System.out.println("remove() 删除队列中第一个元素，并返回该元素的值，如果元素为null，将抛出异常: "+AD.remove());
        System.out.println(AD);
        // ArrayBlockingQueue
        ArrayDeque dqe = new ArrayDeque();
        dqe.push(2);         //add与push都可以使用 一个作为队列 一个作为 栈
        dqe.push(100);
        dqe.push(22);
        dqe.add(10086);
        dqe.add(10010);
        System.out.println("先堆再队列输出为"+dqe); // 堆输出的按照堆的方式输出 队列的按照队列方式 总体按照队列方式 先进先出


    }

}
