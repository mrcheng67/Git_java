package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// 循环输出方式
public class list {
    // for循环输出
    public static void list(int[] abb){
        for(int i=0;i<abb.length;i++){
            System.out.println("{ = "+abb[i]);
        }
    }
    // 迭代器输出
    public static <E> void list2(Iterable<E> array){
        Iterator<E> it = array.iterator();
        do{
            System.out.println("it.next() = "+it.next());
        }while (it.hasNext());

    }
    public static void main(String[] args){
        int[] abb = {1,5,7,0,13,65};
        list(abb);
        Integer[] abc = {1,5,7,0,13,65};
        List<Integer> abcd = Arrays.asList(abc);
        list3(abc);
    }
    // for 中的另一个语法
    public static <E> void list3(E[] array){
        for(E element:array){
            System.out.println("element = %d"+ element);
        }
    }
}
