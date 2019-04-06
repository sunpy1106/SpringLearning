package com.yueming.multdatasource;

import javafx.scene.chart.PieChart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Arrays;

public class MultDataSourceDemo {
    public static void main(String[] args) throws SQLException {
        System.out.println("hello world");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        showBeans(applicationContext);

        DataSourceSwitcher dataSourceSwitcher = (DataSourceSwitcher)applicationContext.getBean("dataSourceSwitcher");
        System.out.println(dataSourceSwitcher.toString());
        System.out.println(dataSourceSwitcher.getConnection().toString());

        System.out.println(DataSourceSwitcher.getDataSourceKey());
        DataSourceSwitcher.setDataSourceKey( "ds2");
        System.out.println(dataSourceSwitcher.getConnection().toString());

    }

    public static void showBeans(ApplicationContext applicationContext){
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}
