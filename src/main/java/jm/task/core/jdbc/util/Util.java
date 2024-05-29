package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USEERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection = null;

    public static Connection getConnection() {

        try {
            connection = DriverManager.getConnection(URL, USEERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection error");
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
            if (connection.isClosed()){
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            System.out.println("Connection closing error");
        }
    }
}
