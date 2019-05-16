package com.hantangtouzi.core.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author WilliamChang.
 * Created on 2019-01-22 13:17:42
 */

public class PreparedStatementDemo {
    public static void main(String[] args) {
        Connection connection = DbUtil.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement("select * from t_user")) {
            if (preparedStatement != null) {
                System.out.println("PreparedStatementSuccess");
            } else {
                System.out.println("PreparedStatement Failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
