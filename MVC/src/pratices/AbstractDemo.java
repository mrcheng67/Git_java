package pratices;

import java.util.ArrayList;

public class AbstractDemo
{
    public static void main(String [] args)
    {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        ArrayList<Student> myNumbers = new ArrayList<>();
        myNumbers.add(new Student("Ambehta, UP", 30, "3600.00"));
        myNumbers.add(new Student("Ambehta, down", 31, "3600.00"));
        myNumbers.add(new Student("Ambehta, left", 32, "3600.00"));

        for(Student stu:myNumbers){
            System.out.println("stu = "+stu);
        }

        System.out.println("Stu[1]"+myNumbers.get(1));

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}

class Student {
    // 类的属性
    private String name;
    private int age;
    private String studentID;

    // 构造函数
    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    // name的getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // age的getter和setter方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // studentID的getter和setter方法
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // 重写toString方法，方便打印学生信息
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}

