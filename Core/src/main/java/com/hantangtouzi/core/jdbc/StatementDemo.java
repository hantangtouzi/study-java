package com.hantangtouzi.core.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author WilliamChang.
 * Created on 2018/12/4 15:28
 */

public class StatementDemo {
    public static void main(String[] args) {
        Statement statement = getStatement();
        if (statement != null) {
            System.out.println("Statement Success");
        } else {
            System.out.println("Statement Failure");
        }
    }

    private static Statement getStatement() {
        Connection connection = ConnectionDemo.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }
}
