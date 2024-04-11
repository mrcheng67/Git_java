package org.example.Annotation.service.Impl;


import org.example.Annotation.dao.Dao;
import org.example.Annotation.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@org.springframework.stereotype.Service("service")
public class ServiceImpl implements Service {
    @Autowired
    @Qualifier("Dao")       //按照id值从容器中匹配的        它跟里面的值相关@Repository("Dao")
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
