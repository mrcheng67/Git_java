package list;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class field <E>{
    public static void main(String[] args){
        ArrayList arrays = new ArrayList();  // 没有泛型 没有指定数据类型 所有的数据呗默认为Object 类型 连length都不能调用
        arrays.add(123);
        arrays.add("nihao");
        Iterator it = arrays.iterator();
        while(it.hasNext()){
            // String a = (String) it.next(); // 无法 接收  强转后无法使用length
            System.out.println(it.next());
        }

        //泛型 就是为了统一数据
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<Integer> ita = arrayList.iterator(); //迭代器的泛型 与 ArrayList一致 迭代器在数组包中

        ArrayList<Animal> Animal = new ArrayList<>();
        Animal.add(new Animal());
        Animal.add(new Dog()); //可以传入本身与他的子类
        //Animal.add(new field()); //别的就不行了

        // 这里使用下面的代码 泛型类
        field<String> fie = new field<String>();
        fie.add("123");
        fie.add("你好");
        fie.add("世界");
        System.out.println(fie.toString());

    }

    Object[] obj = new Object[10];
    int size;
    //E 表示不确定的类型 ，该类型在类名后面已经定义了 e 变量名
    public <E> Boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }
    public <E> E get(int index){ //可以在方法中使用<E>泛型
        return (E)obj[index];
    }
    @Override
    public String toString(){
        return Arrays.toString(obj); // 强转为String
    }

    ArrayList<Animal> list = new ArrayList<>();
    
    public static void method(ArrayList<? extends Animal> Array){

    }
}
class Animal{

}
class Dog extends Animal{

}
