package cn.log_in;

import cn.Utils.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class LogIn_prepareStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名: ");
        String name = sc.nextLine();
        System.out.print("请输入密码: ");
        String password = sc.nextLine();
        Boolean login = new LogIn_prepareStatement().LogIn_prepareStatement(name,password);
        if(login){
            System.out.println("登录成功");
        }
        else{
            System.out.println("登录失败");
        }
    }
    public Boolean LogIn_prepareStatement(String UserName,String password){
        Connection conn = null;
        PreparedStatement prepare = null;
        ResultSet rs = null;
        try {
            conn = Utils.connection();
            String sql = "select * from user where name = ? and password = ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1,UserName);
            prepare.setString(2,password);
            rs = prepare.executeQuery();
            return rs.next();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            Utils.close(rs,prepare,conn);
        }
    }
}
