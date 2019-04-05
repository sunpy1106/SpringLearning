package com.yueming.data;


import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;


//@Configuration
public class PureDataSourceDemo {

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //@Autowired
    private DataSource dataSource;
    public static void main(String [] args) throws SQLException{
        System.out.println("hello world");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        showBeans(applicationContext);
        //dataSourceDemo(applicationContext);
    }

    public static void showBeans(ApplicationContext applicationContext){
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }

    @Bean
    public DataSource dataSource() throws  Exception{
        System.out.println("create dataSource");
        Properties properties = new Properties();
        properties.setProperty("driverClassName","com.mysql.jdbc.Driver");
        properties.setProperty("url","jdbc:mysql://127.0.0.1:3306/test");
        properties.setProperty("username","root");
        return BasicDataSourceFactory.createDataSource(properties);
    }

    private static void dataSourceDemo(ApplicationContext applicationContext ) throws SQLException{
        PureDataSourceDemo  demo = applicationContext.getBean("pureDataSourceDemo",PureDataSourceDemo.class);
    }

}
