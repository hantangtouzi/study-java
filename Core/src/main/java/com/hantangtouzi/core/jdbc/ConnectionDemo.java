package com.hantangtouzi.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author WilliamChang.
 * Created on 2018/11/10 16:59
 */

public class ConnectionDemo {
    public static void main(String[] args) {
        getConnection();
    }

    public static Connection getConnection() {
        String jdbcDriver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/studyjava?useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&autoReconnect=true";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            Class.forName(jdbcDriver);
            connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("Connect database success!");
            } else {
                System.out.println("Connect database faulure!");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
