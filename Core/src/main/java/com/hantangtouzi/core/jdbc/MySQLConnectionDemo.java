package com.hantangtouzi.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author WilliamChang.
 * Created on 2020-05-18 03:55:06
 */

public class MySQLConnectionDemo {
    public static void main(String[] args) throws Exception {
        Connection connection = getConnection();
        DbUtil.closeConnection(connection);
    }

    public static Connection getConnection() throws Exception {
        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/study_java_core?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            if (connection != null) {
                System.out.println("Connect database success!");
                return connection;
            } else {
                System.out.println("Connect database faulure!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
