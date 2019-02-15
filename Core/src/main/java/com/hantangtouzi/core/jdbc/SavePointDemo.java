package com.hantangtouzi.core.jdbc;

import java.sql.*;

/**
 * @author WilliamChang.
 * Created on 2019-02-15 12:20:18
 */

public class SavePointDemo {
    public static void main(String[] args) throws SQLException {
        String url = "";
        String user = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, user, password);
        String sql1 = "delete from t_user where id = 1";
        String sql2 = "delete from t_user where id = 2";

        Statement statement = connection.createStatement();

        connection.setAutoCommit(false);
        int rows = statement.executeUpdate(sql1);
        Savepoint savepoint1 = connection.setSavepoint("savepoint1");

        statement.execute(sql2);
        Savepoint savepoint2 = connection.setSavepoint("savepoint2");

        connection.rollback(savepoint1);
        connection.commit();

        connection.close();
        statement.close();
    }
}
