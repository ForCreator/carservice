package com.opportunity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private final static String URL = "jdbc:mysql://localhost:3306/car_service";
    private static final String USER = "root";
    private static final String PASSWORD = "Sloter417";

    static public Connection getConnect() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
