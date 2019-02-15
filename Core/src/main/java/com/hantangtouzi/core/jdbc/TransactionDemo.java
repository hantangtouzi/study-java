package com.hantangtouzi.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author WilliamChang.
 * Created on 2019-02-15 11:50:22
 */

public class TransactionDemo {
    public static void main(String[] args) throws SQLException {
        String url = "";
        String user = "sa";
        String password = "";

        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "delete from t_user where id = 1";

        Statement statement = connection.createStatement();

        connection.setAutoCommit(false);
        int rows = statement.executeUpdate(sql);
        System.out.println("受影响的行： " + rows);
        connection.commit();

        connection.close();
        statement.close();
    }
}
