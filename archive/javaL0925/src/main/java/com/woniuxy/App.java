package com.woniuxy;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hrms?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
        Connection connection = DriverManager.getConnection(url, "root", "123456");
      //statement 静态语句操作
       /* Statement statement = connection.createStatement();
        String sql = "insert into dept values(60,'网销部','网络销售')";
        int i = statement.executeUpdate(sql);*/
        String sql ="insert into dept values (?,?,?)";
        PreparedStatement ps=connection.prepareStatement(sql);
        ps.setInt(1,7);
        ps.setString(2,"网络部");
        ps.setString(3,"网络维护");
        int i =ps.executeUpdate();
        System.out.println(i);
        ps.close();
        connection.close();

    }
}
