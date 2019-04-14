package com.yueming.springmybatis;

import com.yueming.springmybatis.DAO.UserMapper;
import com.yueming.springmybatis.VO.User;
import com.yueming.springmybatis.service.FooService;
import com.yueming.springmybatis.service.impl.FooServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MybatisDemo {
    public static void main(String[] args){
        System.out.println("hello world");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        showBeans(applicationContext);
        UserMapper userMapper =(UserMapper) applicationContext.getBean("userMapper");
        FooService fooService = (FooService) new FooServiceImpl(userMapper);
        User user = fooService.doSomeBusinessStuff("1");
        System.out.println("name " + user.getName() +",tel :" + user.getTel());
    }

    public static void showBeans(ApplicationContext applicationContext){
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }

}
