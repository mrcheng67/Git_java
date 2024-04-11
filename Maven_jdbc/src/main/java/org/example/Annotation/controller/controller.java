package org.example.Annotation.controller;

import org.example.Annotation.config.Springconfig;
import org.example.Annotation.service.Impl.ServiceImpl;
import org.example.Annotation.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class controller {
    public static void main(String[] args){
        //ApplicationContext appl = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext appl = new AnnotationConfigApplicationContext(Springconfig.class);
        ServiceImpl service = appl.getBean(ServiceImpl.class);
        service.save();
    }
}
