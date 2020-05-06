package com.hantangtouzi.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author WilliamChang.
 * Created on 2019-05-16 14:40:17
 */

public class DbUtil {
    public static Connection getConnection() {
        String jdbcDriver = "org.h2.Driver";
        String url = "jdbc:h2:mem:test;MODE=MYSQL;DB_CLOSE_ON_EXIT=TRUE";
        String username = "sa";
        String password = "";

        Connection connection = null;

        try {
            Class.forName(jdbcDriver);
            connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("Connect database success!");
            } else {
                System.out.println("Connect database faulure!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;

    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
