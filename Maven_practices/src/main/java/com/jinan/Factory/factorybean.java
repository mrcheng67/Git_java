package com.jinan.Factory;

import com.jinan.dao.Dao;
import com.jinan.service.Impl.ServiceImpl;
import com.jinan.service.Service;
import org.springframework.beans.factory.FactoryBean;

public class factorybean implements FactoryBean<Service> {
    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public Service getObject() throws Exception {
        return new ServiceImpl(dao);
    }

    @Override
    public Class<ServiceImpl> getObjectType() {
        return ServiceImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
