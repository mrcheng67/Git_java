package com.jinan.construct;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class construct {
    private List<String> list;
    private Map<String,Integer> map;
    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void save() {
        System.out.println("这是一个construct的List输出"+list);
    }
}
