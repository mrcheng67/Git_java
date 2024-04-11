package org.example.Annotation.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration  //标志该类是Spring的核心配置类
@ComponentScan("org.example.Annotation")  //自动扫描组件 == <context:component-scan base-package="org.example.Annotation"/>
@Import({DataSourceConfig.class}) //加话口号是为了将引入变成数组  以此引入多个
public class Springconfig {


}
