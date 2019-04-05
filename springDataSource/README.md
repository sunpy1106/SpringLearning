### 原始的spring项目引入jdbc
#### 通过引入applicationContext.xml中的bean配置文件来引入bean
>采用这种方法应用完成根据xml的配置生成bean，此时只会生成dataSource这个bean
#### 通过JAVA注解和component-scan方式可以减少很多配置操作
>采用这种方式应用生成的bean如下
>>pureDataSourceDemo, org.springframework.context.annotation.internalConfigurationAnnotationProcessor, org.springframework.context.annotation.internalAutowiredAnnotationProcessor, org.springframework.context.annotation.internalCommonAnnotationProcessor, org.springframework.context.event.internalEventListenerProcessor, org.springframework.context.event.internalEventListenerFactory, 
dataSource
