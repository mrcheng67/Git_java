package cn.transaction;

import cn.Utils.Utils;
import cn.log_in.LogIn;

import java.sql.*;
import java.util.Scanner;


// 事务
public class transaction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入金额: ");
        Double number = sc.nextDouble();
        System.out.print("请输入转账者: ");
        int a = sc.nextInt();
        System.out.print("请输入到账人: ");
        int b = sc.nextInt();
        new transaction().login(number,a,b);
        System.out.println("执行成功");
    }
    public ResultSet login(Double number, int a , int b) {
        Connection conn = null;
        PreparedStatement state = null;
        PreparedStatement state2 = null;
        //ResultSet rs1 = null;
        //ResultSet rs2 = null;
        try {
            conn = Utils.connection();
            conn.setAutoCommit(false);
            String sql = "update bank set account = account - ? where id = ?";
            String sql2 = "update bank set account = account + ? where id = ?";
            state = conn.prepareStatement(sql);
            state2 = conn.prepareStatement(sql2);
            state.setDouble(1, number);
            state.setInt(2, a);

            state2.setDouble(1, number);
            state2.setInt(2, b);

            state.executeUpdate();

            state2.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            Utils.close(state, conn);
            Utils.close(state2, conn);
        }
        return null;
    }
}
