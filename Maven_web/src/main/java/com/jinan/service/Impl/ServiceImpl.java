package com.jinan.service.Impl;

import com.jinan.dao.Dao;
import com.jinan.dao.Impl.DaoImpl;
import com.jinan.service.Service;

public class ServiceImpl implements Service {
    private Dao dao ;

    public ServiceImpl(Dao dao) {   //构造器注入
        this.dao = dao;     //不太懂 用factorybean的时候那我们的dao实例 怎么用set方法 不用构造器传到service中
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public void save() {
        System.out.println("这是service的一个输出方法");
        dao.save();
    }
}
