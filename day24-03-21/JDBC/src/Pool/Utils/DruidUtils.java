package Pool.Utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DruidUtils {
    private static DataSource ds;

    static{
        try {
            Properties proper = new Properties();
            proper.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(proper);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static DataSource getDataSource(){
        return ds;
    }

    public static Connection connection() throws SQLException {
        return ds.getConnection();
    }

    public static boolean getClose(Statement state,Connection conn){
        if(state!=null){
            try {
                state.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(conn!=null){
            try {
                conn.close();
                return true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }
    public static boolean getClose(ResultSet rs,Statement state, Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(state!=null){
            try {
                state.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(conn!=null){
            try {
                conn.close();
                return true;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

}
