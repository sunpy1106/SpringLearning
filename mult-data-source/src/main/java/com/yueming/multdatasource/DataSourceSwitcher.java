package com.yueming.multdatasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceSwitcher extends AbstractRoutingDataSource {

    private static final ThreadLocal<String> dataSourceKey = new ThreadLocal<String>();
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }

    public static void setDataSourceKey(String dataSourceString){
        dataSourceKey.set(dataSourceString);
    }

    public static  String getDataSourceKey(){
        return dataSourceKey.get();
    }
}
