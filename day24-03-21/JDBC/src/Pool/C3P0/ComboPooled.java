package Pool.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComboPooled {
    public static void main(String[] args) throws SQLException {
        //创建ComboPooledDataSource数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //从数据源获取连接
        Connection conn = dataSource.getConnection();
        //预处理sql语句及执行查询操作
        ResultSet rs = conn.prepareStatement("select * from bank;").executeQuery();
        //处理sql查询的数据结果
        if (rs.next()) {
            System.out.println(rs.getInt(1));
        }
        //释放连接到连接池
        rs.close();
        conn.close();
        dataSource.close();
    }

}
