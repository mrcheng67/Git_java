package abstracts.swim;

public abstract class swim {
    private String name;
    private int age = 0;
    private String address;

    public void who(){
        System.out.println("每个人都可以游泳");
        this.swim();
        System.out.println("---游泳结束---");
    }
    public abstract void swim();
}
