package Serializ;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;
    private Double Id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Id=" + Id +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Double id) {
        Id = id;
    }

    public int getAge() {
        return age;
    }

    public Double getId() {
        return Id;
    }
}
