package com.jinan;

import com.jinan.construct.construct;
import com.jinan.dao.Dao;
import com.jinan.service.Impl.ServiceImpl;
import com.jinan.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        //获取Ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean
        //Dao book = (Dao) ctx.getBean("bookDao");
        //book.save();
        //Service s = (Service) ctx.getBean("Userservicee");
        Service s = ctx.getBean(ServiceImpl.class);  //与上面那句 意思相同
        s.save();
        construct con = (construct) ctx.getBean("Userconstruct");
        con.save();

    }

}
