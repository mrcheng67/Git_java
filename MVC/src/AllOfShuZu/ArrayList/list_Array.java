package AllOfShuZu.ArrayList;

import javax.lang.model.element.Element;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class list_Array {
    public static void main(String[] args){
        List<String> collection = new ArrayList<>();
        System.out.println("未添加元属之前判断是否为空: "+collection.isEmpty());
        collection.add("Element 1");
        collection.add("Element 2");
        collection.addLast("Element 3");
        collection.add("Element 4");
        collection.addFirst("Element 5");
        collection.add("Element 6");
        System.out.println("添加元属之后判断是否为空: "+collection.isEmpty());
        LinkedList<String> list = new LinkedList<>(collection);
        System.out.println("collection = "+collection);
        System.out.println("list = "+list);
        System.out.println("list = "+list.remove(3));
        System.out.println("list = 删除第三个下标后"+list);

        System.out.println("LinkList是否包含Element 1 = "+list.contains("Element 1"));

        ArrayList array = new ArrayList();
        array.addLast("array Element 1");
        array.add("array Element 2");
        array.add("array Element 3");
        array.add("array Element 4");
        array.add("array Element 5");
        array.addFirst("array Element 6");
        System.out.println("ArrayList是否包含array Element 1 = "+array.contains("array Element 1"));
    }
}
