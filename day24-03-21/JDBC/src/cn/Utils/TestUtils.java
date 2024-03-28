package cn.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestUtils {
    public static void main(String[] aegs) throws Exception {
        ResultSet rs = null;
        // ResultSet 获得返回值的集合 .next()表示下一行 .getInt() .getString()等获得列 get里面传数字为第几列 传字符就是列名
        Connection conn = Utils.connection();
        String sql = "select * from bank";
        Statement state = conn.createStatement();
        rs = state.executeQuery(sql);
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString("name");
            Double account = rs.getDouble(3);
            System.out.println("数据库中第一列数据 id="+id+"\t第二列数据name="+name+"\t第三列数据account="+account);
        }
        Utils.close(rs,state,conn);
    }
}
