package Class_inner.Iner_Block.for_lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class for_lambda {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("niu");
        arr.add("niu1");
        arr.add("niu2");
        arr.add("niu3");
        Collection<String> ch = new ArrayList<>();
        ch.add("ch");
        ch.add("ch1");
        ch.add("ch2");
        ch.add("ch3");
        //正常版
        arr.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("arr中的值为:"+s);
            }
        });
        // 简化版
        ch.forEach((String s) -> System.out.println("ch中的值为: "+s));
    }
}
