package cn.log_in;

import cn.Utils.Utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名: ");
        String name = sc.nextLine();
        System.out.print("请输入密码: ");
        String password = sc.nextLine();
        Boolean login = new LogIn().login(name,password);
        if(login){
            System.out.println("登录成功");
        }
        else{
            System.out.println("登录失败");
        }
    }
    public Boolean login(String UserName,String password){
        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;
        try {
            conn = Utils.connection();
            state = conn.createStatement();
            String sql = "select * from user where name='"+UserName+"' and password='"+password+"'";
            rs = state.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            Utils.close(rs,state,conn);
        }

    }
}
