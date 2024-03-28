package pratices;

import java.util.Scanner;
import java.io.*;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;
enum niubi{     //枚举
    niu,ji,gou,zhu;
}

/*public class pratices {
    public static void main(String[] args) throws IOException {
        System.out.printf("你好，请输入数据");
        Scanner a = new Scanner(System.in);
        String b = a.next();
        System.out.printf(b);
        niubi c = niubi.ji;
        System.out.println("c = " + c);
        for (niubi n : niubi.values()) {
            System.out.printf(String.valueOf(n));
        }
    }
}
*/
// 基类
class Animal {
    void display() {
        System.out.println("This is an Animal");
    }
}

// Animal的子类
class Dog extends Animal {
    @Override
    void display() {
        System.out.println("This is a Dog");
    }
}

// Animal的另一个子类
class Cat extends Animal {
    @Override
    void display() {
        System.out.println("This is a Cat");
    }
}

public class pratices {
    // 这个方法接受Animal及其子类的集合
    public static void processAnimals(Collection<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.display(); // 调用每个动物的display方法
        }
    }

    public static void main(String[] args) {
        // 创建不同类型的集合
        Collection<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());                     //  这是new一个dog对象到animals数组中去 与下面的无关
        Collection<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        Collection<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        Iterator<Dog> it = dogs.iterator();
        System.out.println(it.next());

        // 调用processAnimals方法处理这些集合
        System.out.println("Processing animals collection:");
        processAnimals(animals);
        System.out.println("\nProcessing dogs collection:");
        processAnimals(dogs);
        System.out.println("\nProcessing cats collection:");
        processAnimals(cats);
    }
}

