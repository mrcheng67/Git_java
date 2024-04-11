package com.jinan.construct;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class construct {
    private List<String> list;
    private Map<String,User> map;
    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void save() {
        System.out.println("这是一个construct的List输出\t"+list);
        System.out.println("这是一个construct的Map输出\t"+map);
        System.out.println("这是一个construct的properties输出\t"+properties);
    }
}
