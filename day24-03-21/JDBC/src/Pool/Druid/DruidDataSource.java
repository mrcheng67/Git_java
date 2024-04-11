package Pool.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DruidDataSource {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Properties properties = new Properties();
        ClassLoader Druid = DruidDataSource.class.getClassLoader();
        InputStream is = Druid.getResourceAsStream("druid.properties");
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

}
