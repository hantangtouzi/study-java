package com.hantangtouzi.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author WilliamChang.
 * Created on 2018/11/10 16:59
 */

public class ConnectionDemo {
    public static void main(String[] args) throws Exception {
        Connection connection = getConnection();
        DbUtil.closeConnection(connection);
    }

    public static Connection getConnection() throws Exception {
        String jdbcDriver = "org.h2.Driver";
        String url = "jdbc:h2:mem:test;MODE=MYSQL;DB_CLOSE_ON_EXIT=TRUE";
        String username = "sa";
        String password = "";

        Class.forName(jdbcDriver);

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
