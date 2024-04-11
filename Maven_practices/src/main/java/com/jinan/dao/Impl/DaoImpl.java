package com.jinan.dao.Impl;

import com.jinan.dao.Dao;

public class DaoImpl implements Dao {
    private int num;
    private String DataName;
    public DaoImpl(){
        System.out.println("这是Dao的无参构造器 ---");
    }

    public DaoImpl(int num, String dataName) {
        this.num = num;
        this.DataName = dataName;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDataName(String dataName) {
        DataName = dataName;
    }

    @Override
    public void save() {
        System.out.println("这是一个Dao的book输出"+DataName+"数目"+num);
    }
}
