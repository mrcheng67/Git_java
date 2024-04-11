package example.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.jboss.C3P0PooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;

import java.util.Properties;
import java.util.ResourceBundle;

public class DataSourceDemo {

    @Test
    public void TestBean() throws SQLException {
        ApplicationContext appli = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource data = appli.getBean(DataSource.class);
        Connection conn = data.getConnection();
        String sql ="select * from bank";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        if (conn!= null){
            System.out.println("数据库连接成功");
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        }else {
            System.out.println("数据库连接失败");
        }
        //释放资源
        rs.close();
        conn.close();
    }

    @Test  //druid的测试  是否可以运行
    public void TestDruid() throws Exception {
        //加载配置文件
        Properties properties = new Properties();
        ClassLoader Druid = DruidDataSource.class.getClassLoader();
        InputStream is = Druid.getResourceAsStream("druid.properties");
        //      还有一种加载properties文件的方式
        //  ResourceBundle  但是需要set值 有点麻烦
        properties.load(is);
        //创建一个指定参数的数据库连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //获取获取连接
        Connection conn = dataSource.getConnection();
        ResultSet rs = conn.prepareStatement("select * from bank").executeQuery();
        //判断是否连接成功
        if (conn!= null){
            System.out.println("数据库连接成功");
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        }else {
            System.out.println("数据库连接失败");
        }
        //释放资源
        rs.close();
        conn.close();
    }
    @Test       //C3P0的测试  是否可以运行
    public void TestC3P0() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        Connection conn = dataSource.getConnection();
        String sql = "select * from bank";
        PreparedStatement pres = conn.prepareStatement(sql);
        ResultSet rs = pres.executeQuery(sql);
        if (conn!= null){
            System.out.println("数据库连接成功");
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        }else {
            System.out.println("数据库连接失败");
        }
        //释放资源
        rs.close();
        pres.close();
        conn.close();
    }

}
