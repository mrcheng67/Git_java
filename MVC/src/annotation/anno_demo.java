package annotation;

@source
public class anno_demo {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated    // 表示已过时 不推荐使用 但是任可以使用
    public int show1(int a,int b){
        return a+b;
    }
    @SuppressWarnings("all")  // 压制所有警告 黄色类
    public int show2(int a,int b){
        return a+b;
    }
    @my_anno2  // 自定义注解
    @my_anno(1) // 为value 可以直接赋值
    public void use(){
        show1(1,2);
        show2(1,2);
    }

    @source
    public void source(){

    }
}
class teacher extends anno_demo{ //teacher 会继承anno_demo的注解

}
enum person {
    p1,p2;
}