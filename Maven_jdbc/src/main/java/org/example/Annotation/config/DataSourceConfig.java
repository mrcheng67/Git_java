package org.example.Annotation.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@PropertySource("classpath:jdbc.properties")
public class DataSourceConfig {
    @Value("${driver}")
    private String drive;
    @Value("${url}")
    private String url;
    @Value("${user}")
    private String user;
    @Value("${password}")
    private String password;

    @Bean("datasource")     //可以替代掉applicationContext.xml中的赋值操作  id=datasource的那部分
    public DataSource getDataSource() throws Exception {
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setDriverClass(drive);
        pool.setJdbcUrl(url);
        pool.setUser(user);
        pool.setPassword(password);
        return pool;
    }
    /**     //下面这部分是我自己写的  没上面的好 我的是读取配置文件
     * public DataSource getDataSource() throws Exception {
     *         Properties pro = new Properties();
     *         ClassLoader classLoader = Springconfig.class.getClassLoader();
     *         InputStream is = classLoader.getResourceAsStream("jdbc.properties");
     *         pro.load(is);
     *         String drive = pro.getProperty("driver");
     *         String url = pro.getProperty("url");
     *         String user = pro.getProperty("user");
     *         String password = pro.getProperty("password");
     *         ComboPooledDataSource pool = new ComboPooledDataSource();
     *         pool.setDriverClass(drive);
     *         pool.setJdbcUrl(url);
     *         pool.setUser(user);
     *         pool.setPassword(password);
     *         return pool;
     *     }
     */
}
