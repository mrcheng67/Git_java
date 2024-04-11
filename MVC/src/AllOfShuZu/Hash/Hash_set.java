package AllOfShuZu.Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

    public static void main(){
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add("张三");
        hs.add("李四");
        hs.add("王五");
        System.out.println("直接Sys输出: "+hs);
        for (Object h:hs){
            System.out.println("Hashset用for each输出 = "+h);
        }
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println("Hashset用迭代器输出:\t"+it.next());
        }

        HashMap<String,Integer> map = new HashMap();
        map.put("appale",123);
        map.put("pear",456);
        map.put("banana",789);
        for(Integer value :map.values()){
            System.out.println("value="+value);
        }
        for(String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println("HashMap:\tkey="+key+"\tvalue="+value);
        }
        System.out.println("是否包含appale的key值："+map.containsKey("appale"));
        map.remove("appale");
        System.out.println(map);
        System.out.println(map.get("pear"));
    }
}
