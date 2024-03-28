package cn.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

// 连接数据库不需要修改该这个java文件 修改jdbc.properties就好咯
public class Utils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    static{
        try {
            Properties pro = new Properties();
            ClassLoader class_loader = Utils.class.getClassLoader();
            InputStream is = class_loader.getResourceAsStream("jdbc.properties");
            pro.load(is);
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection connection() throws Exception {
        return DriverManager.getConnection(url,user,password);
    }

    public static void close(ResultSet rs, Statement state, Connection conn){
        if (rs!=null){
            try {
                rs.close();
                System.out.print("rs已关闭");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (state!=null){
            try {
                state.close();
                System.out.print("\tstate已关闭");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (conn!=null){
            try {
                conn.close();
                System.out.println("\tconn已关闭");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static void close(Statement state, Connection conn){
        if (state!=null){
            try {
                state.close();
                System.out.print("state已关闭");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (conn!=null){
            try {
                conn.close();
                System.out.println("conn已关闭");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
