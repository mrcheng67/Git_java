package cn.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 导入驱动jar包 创建一个文件夹libs 放入jdbc的 jar文件 并右键 add as library
        // 2. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 3. 获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root",""); // localhost:3306 可以省略 jdbc:mysql:///java
        // 4. 定义sql语句
        // String sql = "update bank set account = account - 500 where id = 1";
        String sql = "insert into bank value(null,'赵二',1800)";
        // 5. 获取执行sql的对象 statement
        Statement state = conn.createStatement();
        // 6. 执行sql
        int count = state.executeUpdate(sql); // 有一个execute 可以执行任意语句 现在用的这个可以执行增删改 与创改删等操作 查询有个专门的exectueQuery 返回结果集
        System.out.println("count更新后的数值为："+count); // 返回值为影响的行数
        state.close();
        conn.close();

    }
}

