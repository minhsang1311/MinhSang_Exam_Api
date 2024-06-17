package org.example.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql =  "CREATE TABLE employee ( "
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "full_name VARCHAR(255) NOT NULL, "
                    + "birthday DATE NOT NULL, "
                    + "address VARCHAR(255) NOT NULL, "
                    + "position VARCHAR(255) NOT NULL, "
                    + "department VARCHAR(255) NOT NULL"
                    + ")";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Employee table created successfully!");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
