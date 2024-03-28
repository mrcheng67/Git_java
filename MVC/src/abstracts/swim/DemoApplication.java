package abstracts.swim;

public class DemoApplication {
    public static void main(String[] args){
        student stu = new student();
        stu.swim();
        System.out.println("---------------------------------");
        stu.who();
        swim tea = new Teacher();
        System.out.println("---------------------------------");
        tea.swim();
        System.out.println("---------------------------------");
        tea.who();
    }
}
